package jsnes;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

final class xk extends hu {
   byte[] a;

   xk(Object var1, jn var2) {
      if (var1 instanceof File) {
         File var6 = (File)var1;
         fv.a("ROM: Read from: " + var6);
         this.a(a(var6, var2), a(var6.getName()), var2);
      } else if (var1 instanceof URL) {
         URL var5 = (URL)var1;
         fv.a("ROM: Read from: " + var5);
         URLConnection var4;
         this.a(hu.a((var4 = var5.openConnection()).getInputStream(), var2, 0, var4.getContentLength()), a(var5.getPath()), var2);
      } else {
         throw new IllegalArgumentException();
      }
   }

   private void a(byte[] var1, boolean var2, jn var3) {
      if (var2) {
         jn var6 = var3;
         ZipInputStream var7 = new ZipInputStream(new ByteArrayInputStream(var1));
         int var5 = 0;

         ZipEntry var4;
         while((var4 = var7.getNextEntry()) != null) {
            if (!var4.isDirectory() && (int)var4.getSize() > var5) {
               var5 = (int)var4.getSize();
            }
         }

         var7 = new ZipInputStream(new ByteArrayInputStream(var1));

         while((var4 = var7.getNextEntry()) != null && var4.getSize() != (long)var5) {
            ;
         }

         if (var4 == null) {
            throw new ZipException("ZIP archive contains no files");
         }

         fv.a("ROM: Decompressing " + var4.getName());
         var1 = a(var7, var6, 1, var5);
      }

      fv.a("ROM: Data size: " + var1.length + " bytes");
      this.a = var1;
   }
}
