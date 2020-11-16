package com.company.lab;

 class Square extends Figure {
    int Area = 20;
    int Perimeter = 15;
    int getArea(){
        return Area;
    }
    int getPerimeter(){
        return Perimeter;
    }


     @Override
     public String toString() {
         return "Square";
     }
     }

