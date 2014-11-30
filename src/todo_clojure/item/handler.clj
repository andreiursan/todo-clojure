(ns todo-clojure.item.handler
  (:require [todo-clojure.item.model :refer [create-item
                                             read-items
                                             update-item
                                             delete-item]]
            [todo-clojure.item.view :refer [items-page]]))

(defn handle-index-items [req]
  (let [db (:webdev/db req)
        items (read-items db)]
    {:status 200
     :headers {}
     :body (items-page items)}))

(defn handle-create-item [req]
  (let [name (get-in req [:params "name"])
        description (get-in req [:params "description"])
        db (:webdev/db req)
        item-id (create-item db name description)]
    {:status 302
     :headers {"Location" "/items"}
     :body ""}))
