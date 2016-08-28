(defproject rethinkdb-protobuf "2.2.2"
  :description "Protobufs for RethinkDB"
  :url "http://github.com/apa512/clj-rethinkdb"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:provided {:dependencies [[org.flatland/protobuf "0.8.1"]]}}
  :plugins [[lein-protobuf "0.4.3"]]
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]])
