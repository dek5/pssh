(defproject pssh "0.1"
  :description "Выполняет команду параллельно на нескольких терминалах"
  :dependencies [[org.clojure/clojure "1.4.0-beta5"]
                 [org.clojure/tools.cli "0.2.1"]
                 [org.clojars.rosejn/clansi "1.2.0-SNAPSHOT" :exclusions [org.clojure/clojure]]]
  :main pssh.core)
