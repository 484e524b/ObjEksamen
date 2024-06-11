class Speed extends Bicycle{

    protected static void speedCal() {

            float currentSpeed = (wheelDiameter / 100) * speedRPM;
            System.out.print(Color.colorOut + "Current speed:" + currentSpeed + "Km/h" + "\n");
    }
}
