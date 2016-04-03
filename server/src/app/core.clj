(ns app.core
  (:gen-class))

(use '[ring.adapter.jetty :only (run-jetty)])

(defn app [{:keys [uri]}]
  {:body (format "You requested %s" uri)})

(def server (run-jetty #'app {:port 8080 :join? false}))

(defn -main [& args]
  "Hello world")