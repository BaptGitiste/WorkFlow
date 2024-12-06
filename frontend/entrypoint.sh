#!/bin/sh
# ici on va copier la variable d'environment BACKEND_URL dans le html aprce que avant c'était écrit en dur dedans. 
# donc maintenant on va devoir préciser l'url d'entré dans le docker compose qui prendra en compte l'url
sed -i 's|{{ BACKEND_URL }}|'"$BACKEND_URL"'|g' /usr/share/nginx/html/assets/*.js

exec "$@"