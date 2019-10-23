(defproject pssh "0.1"
  :description "Выполняет команду параллельно на нескольких терминалах"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.cli "0.4.2"]
                 [org.clojars.rosejn/clansi "1.2.0-SNAPSHOT" :exclusions [org.clojure/clojure]]]
  :main pssh.core)
