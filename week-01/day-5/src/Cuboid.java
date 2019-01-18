public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double cubeSide = 10;

        double cubeSurface = 6 * (cubeSide * cubeSide);
        double cubeVolume = (cubeSide * cubeSide * cubeSide);

        System.out.println("Surface Area: " + cubeSurface);
        System.out.println("Volume: " + cubeVolume);


    }


}
