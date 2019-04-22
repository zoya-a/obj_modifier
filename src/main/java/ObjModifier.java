import java.nio.FloatBuffer;

public class ObjModifier {
    public static void centerVertices(FloatBuffer buf) {
        // We often get 3D models which are not positioned at the origin of the coordinate system. Placing such models
        // on a 3D map is harder for users. One solution is to reposition the model such that its center is at the
        // origin of the coordinate system. Your task is to implement such solution.
        //
        // FloatBuffer stores vertices of a mesh in a continuous array of floats (see below)
        // [x0, y0, z0, x1, y1, z1, ..., xn, yn, zn]
        // This kind of layout is common in low-level 3D graphics APIs.
        // TODO: Implement your solution here
    }
}
