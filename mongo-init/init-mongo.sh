mongo -- "$MONGODB_DATABASE" <<EOF
var user = '$MONGODB_USER';
var passwd = '$MONGODB_PASS';
var admin = db.getSiblingDB('admin');
admin.auth(user, passwd);
db.createUser({user: user, pwd: passwd, roles: ["readWrite"]});
EOF
