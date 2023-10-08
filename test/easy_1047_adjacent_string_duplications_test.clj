(ns easy_1047_adjacent_string_duplications-test
  (:require 
    [clojure.test :refer [deftest is]]
    [easy_1047_adjacent_string_duplications :refer [removeDuplicates]]))

(deftest test-removeDuplicates
  (is (= "ca" (removeDuplicates "abbaca")))
  (is (= "ay" (removeDuplicates "azxxzy"))))