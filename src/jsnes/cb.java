package jsnes;

abstract class cb {
   volatile boolean a = false;
   private volatile boolean c = true;
   volatile int[] a;
   private volatile int b;
   protected volatile fg a = null;
   protected volatile boolean b = false;
   private v a = null;
   protected int a;

   public String a() {
      return null;
   }

   public jp[] a() {
      return null;
   }

   public aei[] a() {
      return null;
   }

   public String b() {
      return null;
   }

   public String c() {
      return null;
   }

   public int a() {
      return 0;
   }

   protected int b() {
      return 0;
   }

   public final void a() {
      this.b = this.b();
      this.a(false);
   }

   public final synchronized void a(boolean var1) {
      this.a = var1;
      this.c();
      if (!this.a) {
         this.c = true;
         this.notify();
      }

   }

   public final synchronized void a(v var1) {
      if (var1 != this.a) {
         if (this.a != null) {
            bi.a.a.remove(this);
         }

         this.a = var1;
         if (this.a) {
            if (this.a == null) {
               this.a = false;
               this.c();
               this.c = true;
               this.notify();
               return;
            }

            this.a.a();
         }

      }
   }

   private synchronized void f() {
      this.c = false;
      if (this.a == null) {
         this.a = bi.a.a(this);
      }

      this.a.a();

      while(!this.c) {
         try {
            this.wait();
         } catch (InterruptedException var2) {
            ;
         }
      }

      if (this.a != null) {
         this.a.b();
      }

   }

   public final synchronized void b() {
      this.c = true;
      this.notify();
   }

   protected final void a(int var1) {
      int[] var2 = this.a;
      if (this.a != null) {
         int var3 = (var2 = var2).length;

         for(int var4 = 0; var4 < var3; ++var4) {
            if (var2[var4] == var1) {
               this.a = true;
            }
         }
      }

      if (this.b == var1 && var1 != 0) {
         this.a = true;
         this.b = 0;
      }

      if (this.a) {
         this.f();
      }

      if (this.a != null) {
         this.a.a(this.b() + "  " + this.c());
      }

   }

   public final void a(fg var1) {
      this.a = var1;
      this.c();
   }

   public final fg a() {
      return this.a;
   }

   final void c() {
      this.b = this.a || this.a != null || this.b != 0 || this.a != null;
   }

   protected final void d() {
      ++this.a;
      if (this.a != null) {
         this.a.a("");
      }

   }

   protected final void e() {
      --this.a;
      if (this.a != null) {
         this.a.a("");
      }

   }
}
