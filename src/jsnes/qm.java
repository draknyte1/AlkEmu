package jsnes;

import java.util.Arrays;

final class qm {
   private final int a;
   private final int b;
   final byte[] a;
   private final byte[] b;
   // $FF: synthetic field
   private xx a;

   public qm(xx var1, int var2) {
      this.a = var1;
      super();
      this.a = var2;
      switch(var2) {
      case 2:
         this.b = 3;
         break;
      case 4:
         this.b = 4;
         break;
      case 8:
         this.b = 5;
         break;
      default:
         throw new IllegalArgumentException();
      }

      int var3 = 65536 / (var2 << 3);
      this.a = new byte[var3 << 6];
      this.b = new byte[var3];
      this.a();
   }

   public final void a() {
      Arrays.fill(this.b, (byte)0);
   }

   public final void a(int var1) {
      this.b[var1 >> this.b] = 0;
   }

   public final int a(int var1, int var2) {
      int var3 = (var2 = (var1 = var1 + (var2 << this.b) & 32767) >> this.b) << 6;
      switch(this.b[var2]) {
      case 0:
         bg.a(this.a.a, var1, this.a, var3, this.a);

         for(var1 = var3; var1 < var3 + 64; ++var1) {
            if (this.a[var1] != 0) {
               this.b[var2] = 1;
               return var3;
            }
         }

         this.b[var2] = 2;
         return -1;
      case 1:
         return var3;
      default:
         return -1;
      }
   }
}
