package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.Trabajador;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

public interface ITrabajadorRepository extends JpaRepository<Trabajador, Long>{
    
    @Query(value = "SELECT * FROM Trabajadores WHERE id = :id", nativeQuery = true)
    public Trabajador mostrar(@Param("id") long id);

    //Para mostrar la información básica de los trabajadores
    @Query(nativeQuery = true,
    value = "SELECT CONCAT(primer_nombre, ' ', primer_apellido) as \"nombreCompleto\", " +
            "       cedula as \"cedula\", " +
            "       sexo as Sexo, " +
            "       ciudad_residencia as \"ciudadResidencia\", " +
            "       EXTRACT(YEAR FROM AGE(CURRENT_DATE, fecha_nacimiento)) as Edad, " +
            "       salario as \"salarioActual\" " +
            "FROM Trabajadores " +
            "ORDER BY id_trabajador ASC")
    public List<Map<String, Object>> obtenerInformacionTrabajadores();

    //Para mostrar la información de los empleos de cada trabajador
    @Query(nativeQuery = true,
    value = "SELECT CONCAT(primer_nombre, ' ', primer_apellido) as \"nombreCompleto\", " +
            "       cedula as \"cedula\", " +
            "       cargo as \"cargoDesempeñado\", " +
            "       EXTRACT(YEAR FROM AGE(fecha_salida, fecha_entrada)) as \"añosEnCargo\", " +
            "       HE.salario as Salario, " +
            "       jefe_superior as \"jefeSupervisor\" " +
            "FROM Trabajadores as T " +
            "INNER JOIN historiales_empleos as HE ON T.id_trabajador = HE.id_trabajador_id_trabajador " +
            "ORDER BY T.id_trabajador ASC")
    public List<Map<String, Object>> obtenerInformacionTrabajadoresConHistorial();

    //Para mostrar la información de las certificaciones
    @Query(value = "SELECT CONCAT(primer_nombre, ' ', primer_apellido) as \"nombreCompleto\", " +
                "       cedula as \"cedula\", " +
                "       titulo as \"tituloAdquirido\", " +
                "       fecha_adquisicion as \"fechaAdquisicion\", " +
                "       descripcion as \"descripción\", " +
                "       institucion as \"intitucionEducativa\" " +
                "FROM Trabajadores as T " +
                "INNER JOIN Certificaciones as C ON T.id_trabajador = C.id_trabajador_id_trabajador " +
                "ORDER BY T.id_trabajador ASC", nativeQuery = true)
    public List<Map<String, Object>> obtenerCertificacionesTrabajadores();

    //Para mostrar los permisos de cada trabajador
    @Query(value = "SELECT CONCAT(primer_nombre, ' ', primer_apellido) as \"nombreCompleto\", " +
                "       cedula as \"cedula\", " +
                "       id_permiso as \"idPermiso\", " +
                "       motivo as \"razonPermiso\", " +
                "       estado as \"estadoActual\", " +
                "       fecha_peticion as \"fechaSolicitud\", " +
                "       fecha_revision as \"fechaRevision\", " +
                "       fecha_vigencia_limite as \"fechaValidezPermiso\" " +
                "FROM Trabajadores as T " +
                "INNER JOIN Permisos as P ON T.id_trabajador = P.id_trabajador_id_trabajador " +
                "WHERE estado IN ('Aprobado', 'Reprobado', 'Pendiente') " +
                "ORDER BY T.id_trabajador ASC", nativeQuery = true)
    public List<Map<String, Object>> obtenerPermisosTrabajadores();

}