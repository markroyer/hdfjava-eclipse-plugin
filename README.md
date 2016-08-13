# hdfjava-eclipse-plugin

An Eclipse plugin to provide HDF support in OSGI and Eclipse RCP applications.


The ant build scripts are based on code from:

http://www.lorenzobettini.it/2015/01/creating-p2-composite-repositories-during-the-build/

## Building

The project can be built most easily using maven from the `ncsa.hdf.hdfjava.parent` directory. Typing

```bash
mvn clean verify
```

will build the project and place the built project in 

```bash
$(HOME)/p2.repositories/updates
```

To publish the project to a public site, type

```bash
mvn clean verify -Prelease-composite
```

By default the public site is `ncsa.hdf.hdfjava.parent.wiki`. The local repository and public repository locations are specified in the `ncsa.hdf.hdfjava.repository/pom.xml` file using the `rsync.local.dir` and `rsync.remote.dir` properties.

## Install

To install the plugin, add the following URL to the list of available software sites in eclipse.
[https://raw.githubusercontent.com/wiki/markroyer/hdfjava-eclipse-plugin/p2.repositories/updates/ncsa.hdf.hdfjava.repository](https://raw.githubusercontent.com/wiki/markroyer/hdfjava-eclipse-plugin/p2.repositories/updates/ncsa.hdf.hdfjava.repository)

## LICENSE

See inlcuded LICENSE file.
