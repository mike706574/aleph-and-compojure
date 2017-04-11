(ns example.system
  (:require [compojure.core :as compojure :refer [GET]]
            [compojure.route :as route]
            [example.service :as service]
            [taoensso.timbre :as log]))

(defn routes
  []
  (compojure/routes (GET "/hello" req "Hello, world!\n")))

(defn system [config]
  {:app (service/aleph-service config (routes))})
