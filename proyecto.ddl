-- Generado por Oracle SQL Developer Data Modeler 21.2.0.183.1957
--   en:        2021-09-10 18:21:05 COT
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE area_de_trabajo (
    id_area_trabajo    VARCHAR2(10) NOT NULL,
    nombre_del_espacio VARCHAR2(25) NOT NULL,
    usuario_correo     VARCHAR2(40) NOT NULL
);

ALTER TABLE area_de_trabajo ADD CONSTRAINT area_de_trabajo_pk PRIMARY KEY ( id_area_trabajo );

CREATE TABLE area_trabajo_recurso ( 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    area_de_trabajo_id_area_trabajo VARCHAR2(10) NOT NULL,
    recurso_nombre                  VARCHAR2(20) NOT NULL
);

ALTER TABLE area_trabajo_recurso ADD CONSTRAINT area_trabajo_recurso_pk PRIMARY KEY ( area_de_trabajo_id_area_trabajo,
                                                                                      recurso_nombre );

CREATE TABLE articulo (
    id_articulo     INTEGER NOT NULL,
    nombre          VARCHAR2(30) NOT NULL,
    precio_unitario NUMBER NOT NULL
);

ALTER TABLE articulo ADD CONSTRAINT articulo_pk PRIMARY KEY ( id_articulo );

CREATE TABLE contrato (
    miembro_de_trabajo_correo       VARCHAR2(40) NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    area_de_trabajo_id_area_trabajo VARCHAR2(10) NOT NULL,
    fecha_de_inicio                 DATE NOT NULL,
    deposito                        NUMBER NOT NULL,
    no_trabajador                   INTEGER NOT NULL
);

ALTER TABLE contrato ADD CONSTRAINT contrato_pk PRIMARY KEY ( miembro_de_trabajo_correo,
                                                              area_de_trabajo_id_area_trabajo );

CREATE TABLE cuentas_sociales (
    facebook            VARCHAR2(20),
    twitter             VARCHAR2(20),
    linkedin            VARCHAR2(20),
    cuentas_sociales_id NUMBER NOT NULL
);

ALTER TABLE cuentas_sociales ADD CONSTRAINT cuentas_sociales_pk PRIMARY KEY ( cuentas_sociales_id );

CREATE TABLE factura_detallada_miembro (
    articulo_id_articulo       INTEGER NOT NULL,
    cantidad                   INTEGER NOT NULL,
    precio                     NUMBER NOT NULL,
    no_detalle                 INTEGER NOT NULL,
    factura_miembro_no_factura INTEGER NOT NULL
);

ALTER TABLE factura_detallada_miembro ADD CONSTRAINT factura_detallada_miembro_pk PRIMARY KEY ( no_detalle );

CREATE TABLE factura_detallada_usuario (
    factura_usuario_no_factura INTEGER NOT NULL,
    articulo_id_articulo       INTEGER NOT NULL,
    no_detalle                 INTEGER NOT NULL,
    precio                     NUMBER,
    cantidad                   INTEGER
);

ALTER TABLE factura_detallada_usuario
    ADD CONSTRAINT factura_detallada_usuario_pk PRIMARY KEY ( factura_usuario_no_factura,
                                                              no_detalle,
                                                              articulo_id_articulo );

CREATE TABLE factura_miembro (
    no_factura                INTEGER NOT NULL,
    fecha_de_emision          DATE NOT NULL,
    miembro_de_trabajo_correo VARCHAR2(40) NOT NULL
);

ALTER TABLE factura_miembro ADD CONSTRAINT factura_miembro_pk PRIMARY KEY ( no_factura );

CREATE TABLE factura_usuario (
    usuario_correo   VARCHAR2(40) NOT NULL,
    no_factura       INTEGER NOT NULL,
    fecha_de_emision DATE NOT NULL
);

ALTER TABLE factura_usuario ADD CONSTRAINT factura_usuario_pk PRIMARY KEY ( no_factura );

CREATE TABLE miembro_de_trabajo (
    nombre         VARCHAR2(15) NOT NULL,
    usuario_correo VARCHAR2(40) NOT NULL
);

ALTER TABLE miembro_de_trabajo ADD CONSTRAINT miembro_de_trabajo_pk PRIMARY KEY ( usuario_correo );

CREATE TABLE miembro_trabajo_redes (
    miembro_de_trabajo_correo            VARCHAR2(40) NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    cuentas_sociales_cuentas_sociales_id NUMBER NOT NULL
);

ALTER TABLE miembro_trabajo_redes ADD CONSTRAINT miembro_trabajo_redes_pk PRIMARY KEY ( miembro_de_trabajo_correo,
                                                                                        cuentas_sociales_cuentas_sociales_id );

CREATE TABLE recurso (
    nombre VARCHAR2(20) NOT NULL
);

ALTER TABLE recurso ADD CONSTRAINT recurso_pk PRIMARY KEY ( nombre );

CREATE TABLE reserva_miembro ( 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    area_de_trabajo_id_area_trabajo   VARCHAR2(10) NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    miembro_de_trabajo_usuario_correo VARCHAR2(40) NOT NULL,
    recurso_nombre                    VARCHAR2(20) NOT NULL,
    hora_inicio                       DATE NOT NULL,
    hora_fin                          DATE NOT NULL,
    fecha                             DATE NOT NULL
);

ALTER TABLE reserva_miembro
    ADD CONSTRAINT reserva_miembro_pk PRIMARY KEY ( area_de_trabajo_id_area_trabajo,
                                                    miembro_de_trabajo_usuario_correo,
                                                    recurso_nombre );

CREATE TABLE reserva_usuario (
    usuario_correo                  VARCHAR2(40) NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    area_de_trabajo_id_area_trabajo VARCHAR2(10) NOT NULL,
    recurso_nombre                  VARCHAR2(20) NOT NULL,
    hora_inicio                     DATE NOT NULL,
    hora_fin                        DATE NOT NULL,
    fecha                           DATE NOT NULL
);

CREATE TABLE usuario (
    correo     VARCHAR2(40) NOT NULL,
    contraseña VARCHAR2(30) NOT NULL,
    nombre     VARCHAR2(15) NOT NULL,
    apellido   VARCHAR2(15) NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( correo );

ALTER TABLE area_de_trabajo
    ADD CONSTRAINT area_de_trabajo_usuario_fk FOREIGN KEY ( usuario_correo )
        REFERENCES usuario ( correo );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE area_trabajo_recurso
    ADD CONSTRAINT area_trabajo_recurso_area_de_trabajo_fk FOREIGN KEY ( area_de_trabajo_id_area_trabajo )
        REFERENCES area_de_trabajo ( id_area_trabajo );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE area_trabajo_recurso
    ADD CONSTRAINT area_trabajo_recurso_recurso_fk FOREIGN KEY ( recurso_nombre )
        REFERENCES recurso ( nombre );

ALTER TABLE contrato
    ADD CONSTRAINT contrato_area_de_trabajo_fk FOREIGN KEY ( area_de_trabajo_id_area_trabajo )
        REFERENCES area_de_trabajo ( id_area_trabajo );

ALTER TABLE contrato
    ADD CONSTRAINT contrato_miembro_de_trabajo_fk FOREIGN KEY ( miembro_de_trabajo_correo )
        REFERENCES miembro_de_trabajo ( usuario_correo );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE factura_detallada_miembro
    ADD CONSTRAINT factura_detallada_miembro_articulo_fk FOREIGN KEY ( articulo_id_articulo )
        REFERENCES articulo ( id_articulo );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE factura_detallada_miembro
    ADD CONSTRAINT factura_detallada_miembro_factura_miembro_fk FOREIGN KEY ( factura_miembro_no_factura )
        REFERENCES factura_miembro ( no_factura );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE factura_detallada_usuario
    ADD CONSTRAINT factura_detallada_usuario_articulo_fk FOREIGN KEY ( articulo_id_articulo )
        REFERENCES articulo ( id_articulo );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE factura_detallada_usuario
    ADD CONSTRAINT factura_detallada_usuario_factura_usuario_fk FOREIGN KEY ( factura_usuario_no_factura )
        REFERENCES factura_usuario ( no_factura );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE factura_miembro
    ADD CONSTRAINT factura_miembro_miembro_de_trabajo_fk FOREIGN KEY ( miembro_de_trabajo_correo )
        REFERENCES miembro_de_trabajo ( usuario_correo );

ALTER TABLE factura_usuario
    ADD CONSTRAINT factura_usuario_usuario_fk FOREIGN KEY ( usuario_correo )
        REFERENCES usuario ( correo );

ALTER TABLE miembro_de_trabajo
    ADD CONSTRAINT miembro_de_trabajo_usuario_fk FOREIGN KEY ( usuario_correo )
        REFERENCES usuario ( correo );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE miembro_trabajo_redes
    ADD CONSTRAINT miembro_trabajo_redes_cuentas_sociales_fk FOREIGN KEY ( cuentas_sociales_cuentas_sociales_id )
        REFERENCES cuentas_sociales ( cuentas_sociales_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE miembro_trabajo_redes
    ADD CONSTRAINT miembro_trabajo_redes_miembro_de_trabajo_fk FOREIGN KEY ( miembro_de_trabajo_correo )
        REFERENCES miembro_de_trabajo ( usuario_correo );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE reserva_miembro
    ADD CONSTRAINT reserva_miembro_area_de_trabajo_fk FOREIGN KEY ( area_de_trabajo_id_area_trabajo )
        REFERENCES area_de_trabajo ( id_area_trabajo );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE reserva_miembro
    ADD CONSTRAINT reserva_miembro_miembro_de_trabajo_fk FOREIGN KEY ( miembro_de_trabajo_usuario_correo )
        REFERENCES miembro_de_trabajo ( usuario_correo );

ALTER TABLE reserva_miembro
    ADD CONSTRAINT reserva_miembro_recurso_fk FOREIGN KEY ( recurso_nombre )
        REFERENCES recurso ( nombre );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE reserva_usuario
    ADD CONSTRAINT reserva_usuario_area_de_trabajo_fk FOREIGN KEY ( area_de_trabajo_id_area_trabajo )
        REFERENCES area_de_trabajo ( id_area_trabajo );

ALTER TABLE reserva_usuario
    ADD CONSTRAINT reserva_usuario_recurso_fk FOREIGN KEY ( recurso_nombre )
        REFERENCES recurso ( nombre );

ALTER TABLE reserva_usuario
    ADD CONSTRAINT reserva_usuario_usuario_fk FOREIGN KEY ( usuario_correo )
        REFERENCES usuario ( correo );

CREATE SEQUENCE cuentas_sociales_cuentas_socia START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER cuentas_sociales_cuentas_socia BEFORE
    INSERT ON cuentas_sociales
    FOR EACH ROW
    WHEN ( new.cuentas_sociales_id IS NULL )
BEGIN
    :new.cuentas_sociales_id := cuentas_sociales_cuentas_socia.nextval;
END;
/



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            15
-- CREATE INDEX                             0
-- ALTER TABLE                             34
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           1
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          1
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                  18
-- WARNINGS                                 0
