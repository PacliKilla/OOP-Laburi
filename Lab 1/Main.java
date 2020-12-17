package com.company.lab;

public class Main {
float height;
    public static void main(String[] args) {
	Monitor myMonitor = new Monitor();

	//Monitor

	System.out.println("First Monitor's properties:");
	System.out.println("Monitor colors: " + myMonitor.color);
	System.out.println("Monitor dimension: ");
	System.out.println("Height : " + myMonitor.height);
	System.out.println("Depth : " + myMonitor.depth);
	System.out.println("Width : " + myMonitor.width);
	System.out.println("Resolution : " + myMonitor.resolution);
	myMonitor.color = "black-blue";
	myMonitor.height = 39.3f;
	myMonitor.depth = 12.9f;
	myMonitor.width = 48.6f;
	myMonitor.resolution = "1920x1080";
	System.out.println("Monitor's updated properties:");
	System.out.println("Monitor's color is " + myMonitor.color);
	System.out.println("Monitor's height is: " + myMonitor.height);
	System.out.println("Monitor's depth is: " + myMonitor.depth);
	System.out.println("Monitor's width is: " + myMonitor.width);
	System.out.println("Monitor's resolution is: " + myMonitor.resolution);
	Monitor myMonitor1 = new Monitor();
	myMonitor1.color = "black-yellow";
	myMonitor1.height = 39.4f;
	myMonitor1.depth = 12.9f;
	myMonitor1.width = 48.6f;
	myMonitor1.resolution = "1600x900";

	System.out.println("Comparison:");
	if (myMonitor.color.equals(myMonitor1.color))
		System.out.println("Color is the same");
	else
		System.out.println("Different colors");
	if (myMonitor.height == myMonitor1.height)
		System.out.println("Same height");
	else
		System.out.println("Different heights");
	if (myMonitor.depth == myMonitor1.depth)
		System.out.println("Same depth");
	else
		System.out.println("Different depths");
	if (myMonitor.width == myMonitor1.depth)
		System.out.println("Same width");
	else
		System.out.println("Different width");
	if (myMonitor.resolution.equals(myMonitor1.resolution))
		System.out.println("Resolution is the same");
	else
		System.out.println("Different resolution");

	// Uni students

	University Univ1 = new University("UTM",1964);

	University Univ2 = new University("USM",1946);

	University Univ3 = new University("ULIM",1992);

	System.out.println("Students of: " + Univ1.name + ",founded in: "+ Univ1.foundationYear);

	Student UTMstudents[] = {new Student("Ion", 9, 8, 21),
			new Student("Gheorghe", 9, 6, 20)};

	Student USMstudents[] = {new Student("Bogdan", 8, 10, 23),
			new Student("Nicolae", 9, 6, 19)};

	Student ULIMstudents[] = {new Student("Victor", 5, 6, 19),
			new Student("Roman", 9, 4, 18)};
	System.out.println(UTMstudents[0].name + " " + UTMstudents[0].age + "yo. " + ": Media: " + UTMstudents[0].media);
	System.out.println(UTMstudents[1].name + " " + UTMstudents[1].age + "yo. " + ": Media: " + UTMstudents[1].media);

	System.out.println("Students of: " + Univ2.name + ",founded in: "+ Univ2.foundationYear);
	System.out.println(USMstudents[0].name + " " + USMstudents[0].age + "yo. " + ": Media: " + USMstudents[0].media);
	System.out.println(USMstudents[1].name + " " + USMstudents[1].age + "yo. " + ": Media: " + USMstudents[1].media);

	System.out.println("Students of: " + Univ3.name + ",founded in: "+ Univ3.foundationYear);
	System.out.println(ULIMstudents[0].name + " " + ULIMstudents[0].age + "yo. " + ": Media: " + ULIMstudents[0].media);
	System.out.println(ULIMstudents[1].name + " " + ULIMstudents[1].age + "yo. " + ": Media: " + ULIMstudents[1].media);




	}
}
