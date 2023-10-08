(ns easy_1047_adjacent_string_duplications
  (:require 
    [clojure.string :refer [join]]))

(defn removeDuplicates
  [input]
  (let [reducer (fn [acc v] 
                  (if (or (empty? acc) (not= (peek acc) v))
                    (conj acc v)
                    (pop acc)))]
    (->> input
      (reduce reducer [])
      join)))

(defn -main [& _]
  (println "1047. Remove All Adjacent Duplicates In String")
  (println "\t-> Case 1: " (removeDuplicates "abbaca"))
  (println "\t-> Case 2: " (removeDuplicates "azxxzy")))