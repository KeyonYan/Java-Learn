package com.keyon.algo.KuaiShou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(cin.nextDouble(), cin.nextDouble());
        }
        double step = cin.nextDouble();
        List<Point> markPoints = getMarkPoints(points, step);
        for (Point p : markPoints) {
            System.out.println(p);
        }
    }
    public static List<Point> getMarkPoints(Point[] points, double step) {
        List<Point> markPoints = new ArrayList<>();

        double length = 0;
        Point prev = points[0];
        markPoints.add(prev);

        for (int i = 1; i < points.length; i++) {
            Point curr = points[i];
            double dx = curr.x - prev.x;
            double dy = curr.y - prev.y;
            double d = Math.sqrt(dx * dx + dy * dy);

            length += d;
            if (length == step) {
                length = 0;
                markPoints.add(curr);
                prev = curr;
            } else if (length > step) {
                length -= step;
                double delX = (d-length)*dx/d;
                double delY = (d-length)*dy/d;
                double x = prev.x + delX;
                double y = prev.y + delY;
                markPoints.add(new Point(x, y));
                prev = new Point(x, y);
            } else {
                prev = curr;
            }
        }

        return markPoints;
    }

    public static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return String.format("%f, %f", x, y);
        }
    }
}
