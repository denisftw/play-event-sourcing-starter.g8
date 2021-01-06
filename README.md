# Practical Event Sourcing with Scala

This is the giter8 template of a sample event sourcing application that we will be building over the course of the [Practical Event Sourcing with Scala](https://leanpub.com/practical-event-sourcing-with-scala) book.

## Description

The template is loosely based on the sample application built during the course of [Modern Web Development with Scala](https://leanpub.com/modern-web-development-with-scala). In particular:

* The dependency injection is based on MacWire
* A simple authentication mechanism is based on cookies and Play API
* A database connectivity module is based on ScalikeJDBC and uses PostgreSQL

The frontend sources are separated from the backend and reside in the `ui` directory. All necessary dependencies are already included in the `package.json`. These include:

* Webpack as the frontend build tool/module bundler
* Babel transpiler for using EcmaScript (arrows, classes, `let`, `const`)
* React and Redux
* Axios as the frontend HTTP client
* Bootstrap SCSS

All styles are included so that the application looks decent enough from the very beginning.

The application also utilizes a frontend workflow based on NodeJS. This means that you'll need to have two NodeJS tools installed - `node` and `npm`. Since NodeJS is in constant development, I recommend you install nvm - the NodeJS version manager. Just go to [their website](https://github.com/creationix/nvm#install-script) and follow the instructions. 

After `nvm` is installed, use it to obtain NodeJS itself:

```
$ nvm install v14.15.1
```

Add this to the very end of your `.bashrc` to make sure that the correct version of NodeJS is used by default:

```
nvm use v14.15.1 > /dev/null
```

Open a new terminal and check that `npm` is available:

```
$ npm --version
6.14.9
```

Finally, go to the project directory and download frontend dependencies by typing the following:

```
$ npm install
```

`npm` will download necessary packages to `node_modules` (not under version control). It may take some time, but once it is done, you can finally start compilation of frontend assets by invoking the following script:

```
$ npm run watch
```

Finally, use another terminal window to start sbt in debug mode:

```
$ bash run-sbt.sh
```

Note that Webpack is started in the monitor mode and recompile frontend assets after you change them. Once you start the Play application from sbt using the `run` command, it will also start monitoring backend source files for changes.

## The stack

The final version of the application is going to use several databases, and it will also rely on a messaging system. To simplify everything all of these supporting services are already in the `docker-compose.yml` file inside the `stack` directory. The only thing that is needed is to install both Docker and Docker Compose and do the following:

```
$ cd stack
& docker-compose up
```