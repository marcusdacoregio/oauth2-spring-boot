CREATE TABLE IF NOT EXISTS oauth_client (
    id serial PRIMARY KEY,
    client_id varchar(255) not null,
    client_secret varchar(255) not null,
    grant_types varchar(255) not null,
    scopes varchar(255) not null,
    resources varchar(255),
    redirect_uris varchar(255),
    access_token_validity varchar(255),
    refresh_token_validity varchar(255),
    additional_information varchar(255)
);