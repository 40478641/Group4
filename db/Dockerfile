# Use the latest MySQL image
FROM mysql
# Set the working directory
WORKDIR /tmp
# Copy all the files to the working directory of the container
COPY test-db/*.sql /tmp/
# Copy the main SQL file to docker-entrypoint-initdb.d.
# Scripts and SQL files in this folder are executed on contain-er startup.
# This is specific to MySQL.
COPY test-db/world.sql /docker-entrypoint-initdb.d
# Set the root password
ENV MYSQL_ROOT_PASSWORD example