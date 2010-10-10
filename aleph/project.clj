(defproject aleph "0.1.2-SNAPSHOT"
  :description "an asynchronous web server"
  :repositories {"jboss" "http://repository.jboss.org/nexus/content/groups/public/"}
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.2.0"] 
                 [org.jboss.netty/netty "3.2.2.Final"]
                 [clj-http "0.1.0-SNAPSHOT"]
                 [aleph-core "0.6.0-SNAPSHOT"]
                 [potemkin "0.1.0"]])
