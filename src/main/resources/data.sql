insert into security."user"(id, username, password, algorithm) VALUES
    (1, 'user', '$2y$10$Dh771qt4aVpCoED2vemjCedA1cWrlsEWgqLP0Ryg.rNwlRMMBcahK', 'BCRYPT')
    on conflict do nothing;

insert into security.authority(id, name, user_id) values
    (1, 'READ', 1),
    (2, 'WRITE', 1)
    on conflict do nothing;

insert into security.product(id, name, price, currency) VALUES
    (1, 'IPhone 14', 499.99, 'USD')
    on conflict do nothing;