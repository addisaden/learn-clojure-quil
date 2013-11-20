(ns paint-with-quil.core
  (:use quil.core))


(defn setup
  []
  (smooth)
  (frame-rate 50)
  (background 200))

(defn draw
  []
  (stroke (random 255) (random 255) (random 255))
  (stroke-weight (random 10))
  (fill (random 255) (random 255) (random 255))
  (let [diam1 (+ (random 90) 10)
        diam2 (+ (random 90) 10)
        x    (random (width))
        y    (random (height))]
    (push-matrix)
    (translate x y)
    (rotate (radians (random 360)))
    (ellipse 0 0 diam1 diam2)
    (pop-matrix)
    ))

(defsketch example                
    :title "Bunte Kreise"
    :setup setup           
    :draw draw              
    :size [323 200])

