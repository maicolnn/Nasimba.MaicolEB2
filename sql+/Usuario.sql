CREATE TABLE IF NOT EXISTS MN_USUARIO (
  id_usuario PRIMARY KEY NOT NULL,
  usuario VARCHAR(50),
  contraseña VARCHAR(50)
);
INSERT INTO MN_USUARIO (usuario, contraseña) VALUES
( 'maicol.nasimba@epn.edu.ec', '1754491494'),
( 'profe', '1234');
-- Cambiar el nombre de la columna "contraseña" a "clave" en la tabla MN_USUARIO





CREATE TABLE IF NOT EXISTS Nueva_MN_USUARIO (
    id_usuario INTEGER PRIMARY KEY,
    usuario TEXT,
    clave TEXT
);
INSERT INTO Nueva_MN_USUARIO (id, usuario, clave)
SELECT id_usuario, usuario, contraseña
FROM MN_USUARIO;
DROP TABLE MN_USUARIO;
ALTER TABLE Nueva_MN_USUARIO
RENAME TO MN_USUARIO;
SELECT * FROM MN_USUARIO;
DELETE FROM MN_USUARIO WHERE id_usuario IS NULL;