package Assignment1;

public class Prog2 {
    public static void main(String[] args) {
        float float1 = 1.27f;
        float float2 = 3.881f;
        float float3 = 9.6f;

        int intSum = (int) (float1 + float2 + float3);
        System.out.println("Integer sum is:" + intSum);

        int roundedSum = Math.round(float1 + float2 + float3);
        System.out.println("Rounded sum is:" + roundedSum);
    }
}
