package problems.files;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.ArrayUtils;

import java.io.File;

import static java.util.Objects.nonNull;

/**
 * Created by mtumilowicz on 2018-08-22.
 */
final class PrintDirectoryStructure {
    static void print(String url) {
        Preconditions.checkArgument(nonNull(url));
        File file = new File(url);
        Preconditions.checkArgument(file.exists());

        printStructure(file, "");
    }

    private static void printStructure(File file, String prefix) {
        if (file.isDirectory()) {
            System.out.println(prefix + file);
            for (File subFiles : ArrayUtils.nullToEmpty(file.listFiles(), File[].class)) {
                printStructure(subFiles, prefix + "   ");
            }
        }else {
            System.out.println(prefix + file.getName());
        }
    }
}
