(defproject lemon "0.1.1"
  :description "Lemon library"
  :url "https://github.com/burkaydurdu/lemon"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :signing {:gpg-key "burkaydurdu@outlook.com"}
  :deploy-repositories [["releases" {:url "https://burkaydurdu.com/archiva/internal/releases"
                                     :signing {:gpg-key "90DA6DB7C14EE8A5"}}]
                        ["snapshots" "https://burkaydurdu.com/archiva/internal/snapshots"]]
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns lemon.core})
