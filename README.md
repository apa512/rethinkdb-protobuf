# rethinkdb-protobuf

This Clojure library generates protocol buffers for use in Java or Clojure applications. The versions of this library correspond to the released versions of RethinkDB's protocol buffer. 

[![Clojars Project](http://clojars.org/rethinkdb-protobuf/latest-version.svg)](http://clojars.org/rethinkdb-protobuf)

## Setup

You need a full C toolchain, including `automake-1.14`. `automake-1.15` will not suffice. See this [StackOverflow question](http://stackoverflow.com/questions/29591295/clojure-protobuf-cannot-run-program-path-protoc-in-directory-resources-pro) for more info on setting up. In particular, to debug your toolchain, run

```sh
cd /folder/for/rethinkdb-protobuf
lein protobuf
# lein protobuf will try to set itself up. If it fails, there will be an error, perhaps about protoc being missing
# Then run
cd ~/.lein/cache/lein-protobuf/protobuf-2.6.1
chmod +x autogen.sh
./autogen.sh
./configure
make
```

Fix the errors, and repeat until building works.

## Usage

```
lein protobuf
```

## Deploying

```
lein release
```

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
