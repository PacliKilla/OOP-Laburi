package com.company.lab;

class Triangle extends Figure {
    int Area = 13;
    int Perimeter = 18;
    int getArea(){
        return Area;
    }
    int getPerimeter(){
        return Perimeter;
    }
    @Override
    public String toString() {
        return "Triangle";
    }
}
