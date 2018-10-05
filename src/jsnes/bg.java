package jsnes;

class bg {
   private static final byte[] a = new byte[480];

   public static final int a(int var0, int var1) {
      int var2;
      int var3;
      if (var1 == 15) {
         var3 = (var0 & 31) << 19;
         var2 = (var0 & 992) << 6;
         var3 |= var2;
         var2 = var0 >> 10 << 3;
         return var3 | var2;
      } else {
         var1 = (var1 << 1) + (var2 = var1 << 1 << 3) + (var2 << 4);
         var3 = (var0 & 31) * var1 >> 9 << 16;
         var2 = (var0 & 992) * var1 >> 14 << 8;
         var3 |= var2;
         var2 = (var0 >> 10) * var1 >> 9;
         return var3 | var2;
      }
   }

   public static final int a(int var0) {
      return a(var0, 15);
   }

   public static final int b(int var0) {
      return var0 & 4096 | (var0 & 2048) >> 5 | (var0 & 1024) >> 9;
   }

   private static int a(int var0, int var1, int var2) {
      return a((var0 & 192) << 7 | (var0 & 56) << 4 | (var0 & 7) << 2 | var1, var2);
   }

   protected static final void a(byte[] var0, int var1, int var2, int[] var3, int var4, int[] var5, int var6, int var7) {
      byte var8;
      switch(8 - var7) {
      case 0:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = var5[(var8 & 255) + var6];
         }

         ++var4;
         var1 += var2;
      case 1:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = var5[(var8 & 255) + var6];
         }

         ++var4;
         var1 += var2;
      case 2:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = var5[(var8 & 255) + var6];
         }

         ++var4;
         var1 += var2;
      case 3:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = var5[(var8 & 255) + var6];
         }

         ++var4;
         var1 += var2;
      case 4:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = var5[(var8 & 255) + var6];
         }

         ++var4;
         var1 += var2;
      case 5:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = var5[(var8 & 255) + var6];
         }

         ++var4;
         var1 += var2;
      case 6:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = var5[(var8 & 255) + var6];
         }

         ++var4;
         var1 += var2;
      case 7:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = var5[(var8 & 255) + var6];
         }
      default:
      }
   }

   protected static final void a(byte[] var0, int var1, int var2, int[] var3, int var4, int var5, int var6, int var7) {
      byte var8;
      switch(8 - var7) {
      case 0:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = a(var8 & 255, var5, var6);
         }

         ++var4;
         var1 += var2;
      case 1:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = a(var8 & 255, var5, var6);
         }

         ++var4;
         var1 += var2;
      case 2:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = a(var8 & 255, var5, var6);
         }

         ++var4;
         var1 += var2;
      case 3:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = a(var8 & 255, var5, var6);
         }

         ++var4;
         var1 += var2;
      case 4:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = a(var8 & 255, var5, var6);
         }

         ++var4;
         var1 += var2;
      case 5:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = a(var8 & 255, var5, var6);
         }

         ++var4;
         var1 += var2;
      case 6:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = a(var8 & 255, var5, var6);
         }

         ++var4;
         var1 += var2;
      case 7:
         if ((var8 = var0[var1]) != 0) {
            var3[var4] = a(var8 & 255, var5, var6);
         }
      default:
      }
   }

   protected static final void a(short[] var0, int var1, byte[] var2, int var3, int var4) {
      int var5 = var3;

      int var6;
      short var7;
      for(var6 = 8; var6-- != 0; ++var1) {
         var7 = var0[var1 & 32767];
         var2[var5++] = (byte)((var7 & 128) >> 7 | (var7 & '耀') >> 14);
         var2[var5++] = (byte)((var7 & 64) >> 6 | (var7 & 16384) >> 13);
         var2[var5++] = (byte)((var7 & 32) >> 5 | (var7 & 8192) >> 12);
         var2[var5++] = (byte)((var7 & 16) >> 4 | (var7 & 4096) >> 11);
         var2[var5++] = (byte)((var7 & 8) >> 3 | (var7 & 2048) >> 10);
         var2[var5++] = (byte)((var7 & 4) >> 2 | (var7 & 1024) >> 9);
         var2[var5++] = (byte)((var7 & 2) >> 1 | (var7 & 512) >> 8);
         var2[var5++] = (byte)(var7 & 1 | (var7 & 256) >> 7);
      }

      if (var4 >= 4) {
         var5 = var3;

         int var10001;
         for(var6 = 8; var6-- != 0; ++var1) {
            if ((var7 = var0[var1 & 32767]) != 0) {
               var10001 = var5++;
               var2[var10001] |= (byte)((var7 & 128) >> 5 | (var7 & '耀') >> 12);
               var10001 = var5++;
               var2[var10001] |= (byte)((var7 & 64) >> 4 | (var7 & 16384) >> 11);
               var10001 = var5++;
               var2[var10001] |= (byte)((var7 & 32) >> 3 | (var7 & 8192) >> 10);
               var10001 = var5++;
               var2[var10001] |= (byte)((var7 & 16) >> 2 | (var7 & 4096) >> 9);
               var10001 = var5++;
               var2[var10001] |= (byte)((var7 & 8) >> 1 | (var7 & 2048) >> 8);
               var10001 = var5++;
               var2[var10001] |= (byte)(var7 & 4 | (var7 & 1024) >> 7);
               var10001 = var5++;
               var2[var10001] |= (byte)((var7 & 2) << 1 | (var7 & 512) >> 6);
               var10001 = var5++;
               var2[var10001] |= (byte)((var7 & 1) << 2 | (var7 & 256) >> 5);
            } else {
               var5 += 8;
            }
         }

         if (var4 >= 8) {
            var5 = var3;

            for(var6 = 8; var6-- != 0; ++var1) {
               var7 = var0[var1 & 32767];
               short var8 = var0[var1 + 8 & 32767];
               var10001 = var5++;
               var2[var10001] = (byte)(var2[var10001] | (byte)((var7 & 128) >> 3 | (var7 & '耀') >> 10) | (byte)((var8 & 128) >> 1 | (var8 & '耀') >> 8));
               var10001 = var5++;
               var2[var10001] = (byte)(var2[var10001] | (byte)((var7 & 64) >> 2 | (var7 & 16384) >> 9) | (byte)(var8 & 64 | (var8 & 16384) >> 7));
               var10001 = var5++;
               var2[var10001] = (byte)(var2[var10001] | (byte)((var7 & 32) >> 1 | (var7 & 8192) >> 8) | (byte)((var8 & 32) << 1 | (var8 & 8192) >> 6));
               var10001 = var5++;
               var2[var10001] = (byte)(var2[var10001] | (byte)(var7 & 16 | (var7 & 4096) >> 7) | (byte)((var8 & 16) << 2 | (var8 & 4096) >> 5));
               var10001 = var5++;
               var2[var10001] = (byte)(var2[var10001] | (byte)((var7 & 8) << 1 | (var7 & 2048) >> 6) | (byte)((var8 & 8) << 3 | (var8 & 2048) >> 4));
               var10001 = var5++;
               var2[var10001] = (byte)(var2[var10001] | (byte)((var7 & 4) << 2 | (var7 & 1024) >> 5) | (byte)((var8 & 4) << 4 | (var8 & 1024) >> 3));
               var10001 = var5++;
               var2[var10001] = (byte)(var2[var10001] | (byte)((var7 & 2) << 3 | (var7 & 512) >> 4) | (byte)((var8 & 2) << 5 | (var8 & 512) >> 2));
               var10001 = var5++;
               var2[var10001] = (byte)(var2[var10001] | (byte)((var7 & 1) << 4 | (var7 & 256) >> 3) | (byte)((var8 & 1) << 6 | (var8 & 256) >> 1));
            }

         }
      }
   }

   static {
      for(int var0 = 0; var0 <= 14; ++var0) {
         for(int var1 = 0; var1 <= 31; ++var1) {
            a[(var0 << 5) + var1] = (byte)((var1 << 3) * var0 / 15);
         }
      }

   }
}
