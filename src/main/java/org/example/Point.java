package org.example;

public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;

    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    // distance metotlarının overloading edilmiş versiyonları

    // Hiçbir değer almazsa (0,0) noktasına göre uzaklık hesaplar
    public double distance(){
        return Math.sqrt(x * x + y * y);
    }
    // Başka bir Point objesi alırsa verilen noktaya göre uzaklık hesaplar
    public double distance(Point p){
        int deltaX = this.x-p.x;
        int deltaY = this.y-p.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    // İki farklı int parametresi alırsa (a,b) noktasına göre uzaklık hesaplar
    public double distance(int a,int b){
        int deltaX = this.x-a;
        int deltaY = this.y-b;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

}
