-- Tabla MN_ARSENAL con ID autoincremental y FK a MN_USUARIO
CREATE TABLE IF NOT EXISTS MN_ARSENAL (
    id_arsenal INTEGER PRIMARY KEY AUTOINCREMENT,
    id_usuario INTEGER, 
    arsenal VARCHAR(50),
    
    FOREIGN KEY (id_usuario) REFERENCES MN_USUARIO(id_usuario)  
);

-- Tabla MN_COORDENADA_TIPO con ID autoincremental y FK a MN_USUARIO
CREATE TABLE IF NOT EXISTS MN_COORDENADA_TIPO (
    id_coordenadatipo INTEGER PRIMARY KEY AUTOINCREMENT,
    id_usuario INTEGER, 
    CoordenadaTipo VARCHAR(50),
    
    FOREIGN KEY (id_usuario) REFERENCES MN_USUARIO(id_usuario)  
);

-- Tabla MN_COORDENADAS con ID autoincremental y FK a MN_USUARIO
CREATE TABLE IF NOT EXISTS MN_COORDENADAS (
    id_coordenadas INTEGER PRIMARY KEY AUTOINCREMENT,
    id_usuario INTEGER, 
    Coordenada VARCHAR(50),
    FOREIGN KEY (id_usuario) REFERENCES MN_USUARIO(id_usuario)  
);

-- Tabla MN_HORARIOS con ID autoincremental y FK a MN_USUARIO
CREATE TABLE IF NOT EXISTS MN_HORARIOS (
    id_horarios INTEGER PRIMARY KEY AUTOINCREMENT,
    id_usuario INTEGER,  
    Horario VARCHAR(50),
    FOREIGN KEY (id_usuario) REFERENCES MN_USUARIO(id_usuario)  
);
-- Insertar datos en la tabla MN_ARSENAL
INSERT INTO MN_ARSENAL (id_usuario, arsenal) VALUES
    ('2', 'abcd'),
    ('2',  'ab'),
    ('2',  'abcd'),
    ('2',  'a'),
    ('2',  'ab'),
    ('2',  'abcd'),
    ('2',  'abcd'),
    ('2',  'abcdt'),
    ('2',  'abcd'),
    ('2', 'a');

-- Insertar datos en la tabla MN_COORDENADA_TIPO
INSERT INTO MN_COORDENADA_TIPO (id_usuario, CoordenadaTipo) VALUES
    ('2', 'abcd'),
    ('2',  'ab'),
    ('2',  'abcd'),
    ('2',  'a'),
    ('2',  'ab'),
    ('2',  'abcd'),
    ('2',  'abcd'),
    ('2',  'abcdt'),
    ('2',  'abcd'),
    ('2', 'a');

-- Insertar datos en la tabla MN_COORDENADAS
INSERT INTO MN_COORDENADAS (id_usuario, Coordenada) VALUES
    ('2', '04-Coord_East'),
    ('2', '09-Coord_North'),
    ('2', '04-Coord_East'),
    ('2', '01-Coord_North'),
    ('2', '09-Coord_North'),
    ('2', '04-Coord_East'),
    ('2', '04-Coord_East'),
    ('2', '05-Coord_North'),
    ('2', '03-Coord_North'),
    ('2', '01-Coord_North');

-- Insertar datos en la tabla MN_HORARIOS
INSERT INTO MN_HORARIOS (id_usuario, Horario) VALUES
    ('2', '04-08'),
    ('2', '01-02'),
    ('2', '04-08'),
    ('2', '01-02'),
    ('2', '01-02'),
    ('2', '04-08'),
    ('2', '04-08'),
    ('2', '05-10'),
    ('2', '03-06'),
    ('2', '01-02');
SELECT * FROM MN_ARSENAL;
