package com.company.lab;

 class Rectangle extends Figure {
     int Area = 10;
     int Perimeter = 20;

     int getArea() {
         return Area;
     }

     int getPerimeter() {
         return Perimeter;
     }
     @Override
     public String toString() {
         return "Rectangle";
     }
 }
