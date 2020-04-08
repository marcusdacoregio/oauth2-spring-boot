create table if not exists oauth_refresh_token
(
    token_id       VARCHAR(255),
    token          bytea,
    authentication bytea
);