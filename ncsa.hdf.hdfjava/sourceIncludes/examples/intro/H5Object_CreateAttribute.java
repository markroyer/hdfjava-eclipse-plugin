//
//   Creating a dataset attribute.

package examples.intro;

import ncsa.hdf.object.Attribute;
import ncsa.hdf.object.Datatype;
import ncsa.hdf.object.FileFormat;
import ncsa.hdf.object.h5.H5Datatype;
import ncsa.hdf.object.h5.H5File;
import ncsa.hdf.object.h5.H5Group;
import ncsa.hdf.object.h5.H5ScalarDS;


public class H5Object_CreateAttribute {
	private static String FILENAME = "H5Object_CreateAttribute.h5";
	private static String DATASETNAME = "dset";
    private static final int DIM_X = 4;
    private static final int DIM_Y = 6;
	private static String DATASETATTRIBUTE = "Units";
    private static final int DATATYPE_SIZE = 4;

	private static void CreateDatasetAttribute() {
        H5File file = null;
        H5ScalarDS dset = null;
        Attribute attr = null;
        int[][] dset_data = new int[DIM_X][DIM_Y];
        long[] dims1 = { DIM_X, DIM_Y };
		long[] dims = { 2 };
		int[] attr_data = { 100, 200 };
        final H5Datatype typeInt = new H5Datatype(Datatype.CLASS_INTEGER,
                DATATYPE_SIZE, Datatype.ORDER_BE, -1);

        // Create a new file using default properties.
        try {
            file = new H5File(FILENAME, FileFormat.CREATE);
            file.open();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // Create the dataset.
        try {
            final H5Group rootGrp = (H5Group)file.get("/");
            dset = (H5ScalarDS) H5ScalarDS.create("/" + DATASETNAME, rootGrp, typeInt,
                    dims1, null, null, 0,
                    dset_data);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

		// Create a dataset attribute.
		try {
	        attr = new Attribute(DATASETATTRIBUTE, typeInt, dims, attr_data);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		// Close the file.
		try {
            file.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		H5Object_CreateAttribute.CreateDatasetAttribute();
	}

}
