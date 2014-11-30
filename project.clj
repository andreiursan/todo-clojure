(defproject todo-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.3.2"]
                 [compojure "1.2.2"]
                 [org.clojure/java.jdbc "0.3.6"]
                 [postgresql/postgresql "9.1-901-1.jdbc4"]
                 [hiccup "1.0.5"]]

  :min-lein-version "2.0.0"
  :uberjar-name "todo-clojure.jar"

  :main todo-clojure.core

  :profiles {:dev
               {:main todo-clojure.core/-dev-main}})
