create table Post (
    id int auto_increment primary key,
    title varchar(255) not null,
    content text not null
);

INSERT INTO Post (title, content) VALUES ('First Post', 'Content of first post');