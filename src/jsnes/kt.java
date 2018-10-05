package jsnes;

import java.util.Arrays;

final class kt extends cb {
   private final byte[] a = new byte[65536];
   private final int[] b = new int[4];
   private boolean c;
   private final cz a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private boolean d;
   private boolean e;
   private boolean f;
   private boolean g;
   private boolean h;
   private int h;
   private int i;
   private int j;
   private boolean i;
   private boolean j;
   private boolean k;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private static final int[] c = new int[]{205, 239, 189, 232, 0, 198, 29, 208, 252, 143, 170, 244, 143, 187, 245, 120, 204, 244, 208, 251, 47, 25, 235, 244, 208, 252, 126, 244, 208, 11, 228, 245, 203, 244, 215, 0, 252, 208, 243, 171, 1, 16, 239, 126, 244, 16, 235, 186, 246, 218, 0, 186, 244, 196, 244, 221, 93, 208, 219, 31, 0, 0, 192, 255};
   private final afg[] a = new afg[]{new jh(this), new ja(this), new iy(this), new iw(this), new iv(this), new jg(this), new je(this), new jd(this), new jb(this), new ir(this), new im(this), new in(this), new ij(this), new ik(this), new io(this), new ip(this), new hi(this), new hh(this), new hd(this), new hc(this), new hg(this), new hf(this), new gz(this), new gy(this), new hb(this), new ha(this), new gw(this), new gs(this), new gt(this), new gu(this), new gv(this), new gq(this), new ig(this), new if(this), new id(this), new ic(this), new ib(this), new ia(this), new hy(this), new hx(this), new hw(this), new hv(this), new hs(this), new ht(this), new hq(this), new hr(this), new ho(this), new hp(this), new od(this), new oe(this), new oa(this), new oc(this), new oh(this), new oi(this), new of(this), new og(this), new oj(this), new ok(this), new ov(this), new os(this), new oq(this), new pe(this), new pc(this), new pa(this), new ph(this), new pi(this), new pj(this), new pk(this), new pl(this), new pm(this), new po(this), new pp(this), new pq(this), new pr(this), new pu(this), new pt(this), new pw(this), new pv(this), new py(this), new px(this), new mn(this), new mo(this), new ml(this), new mm(this), new mj(this), new mk(this), new mt(this), new mu(this), new mq(this), new mr(this), new nb(this), new na(this), new my(this), new mx(this), new mv(this), new nd(this), new ni(this), new nk(this), new nm(this), new ne(this), new nf(this), new ng(this), new nh(this), new nn(this), new no(this), new np(this), new nw(this), new nv(this), new nr(this), new nq(this), new nu(this), new ns(this), new la(this), new kz(this), new ky(this), new kx(this), new le(this), new ld(this), new lc(this), new lb(this), new kv(this), new ku(this), new lk(this), new lh(this), new li(this), new lm(this), new ln(this), new ll(this), new lg(this), new lq(this), new lp(this), new lt(this), new ls(this), new lv(this), new lu(this), new lx(this), new lw(this), new lo(this), new md(this), new me(this), new mf(this), new mg(this), new mh(this), new mi(this), new mb(this), new mc(this), new ki(this), new kh(this), new kg(this), new ke(this), new kc(this), new kb(this), new ka(this), new jz(this), new ju(this), new ko(this), new kp(this), new km(this), new kn(this), new kk(this), new aw(this), new ax(this), new at(this), new au(this), new ar(this), new as(this), new ap(this), new aq(this), new an(this), new ao(this), new am(this), new ag(this), new af(this), new ai(this), new ah(this), new aj(this), new ac(this), new ad(this), new ae(this), new s(this), new t(this), new u(this), new w(this), new x(this), new y(this), new aa(this), new r(this), new q(this), new o(this), new n(this), new m(this), new l(this), new j(this), new k(this), new h(this), new i(this), new c(this), new d(this), new a(this), new b(this), new e(this), new f(this), new fz(this), new fx(this), new fy(this), new gd(this), new ge(this), new gc(this), new gk(this), new gj(this), new gi(this), new gh(this), new gf(this), new gp(this), new go(this), new gn(this), new gm(this), new gl(this), new fb(this), new fc(this), new fd(this), new fe(this), new fi(this), new fj(this), new fp(this), new fo(this), new fl(this), new fk(this), new fn(this), new fm(this), new fs(this), new fr(this), new fu(this), new ft(this), new eh(this), new ek(this), new el(this), new ei(this), new ej(this), new eo(this), new er(this), new eq(this), new ep(this), new ex(this), new ew(this), new eu(this), new es(this), new fa(this), new ez(this), new ey(this), new dr(this), new ds(this), new du(this), new dv(this), new dx(this), new dz(this)};
   private static final String[] a = new String[]{"NOP", "TCALL", "SET1", "BBS", "OR", "OR", "OR", "OR", "OR", "OR", "OR1", "ASL", "ASL", "PUSH", "TSET1", "BRK", "BPL", "TCALL", "CLR1", "BBC", "OR", "OR", "OR", "OR", "OR", "OR", "DEC", "ASL", "ASL", "DEC", "CMP", "JMP", "CLRP", "TCALL", "SET1", "BBS", "AND", "AND", "AND", "AND", "AND", "AND", "OR1", "ROL", "ROL", "PUSH", "CBNE", "BRA", "BMI", "TCALL", "CLR1", "BBC", "AND", "AND", "AND", "AND", "AND", "AND", "INC", "ROL", "ROL", "INC", "CMP", "CALL", "SETP", "TCALL", "SET1", "BBS", "EOR", "EOR", "EOR", "EOR", "EOR", "EOR", "AND1", "LSR", "LSR", "PUSH", "TCLR1", "PCALL", "BVC", "TCALL", "CLR1", "BBC", "EOR", "EOR", "EOR", "EOR", "EOR", "EOR", "CMPW", "LSR", "LSR", "MOV", "CMP", "JMP", "CLRC", "TCALL", "SET1", "BBS", "CMP", "CMP", "CMP", "CMP", "CMP", "CMP", "AND1", "ROR", "ROR", "PUSH", "DBNZ", "RET", "BVS", "TCALL", "CLR1", "BBC", "CMP", "CMP", "CMP", "CMP", "CMP", "CMP", "ADDW", "ROR", "ROR", "MOV", "CMP", "RET1", "SETC", "TCALL", "SET1", "BBS", "ADC", "ADC", "ADC", "ADC", "ADC", "ADC", "EOR1", "DEC", "DEC", "MOV", "POP", "MOV", "BCC", "TCALL", "CLR1", "BBC", "ADC", "ADC", "ADC", "ADC", "ADC", "ADC", "SUBW", "DEC", "DEC", "MOV", "DIV", "XCN", "EI", "TCALL", "SET1", "BBS", "SBC", "SBC", "SBC", "SBC", "SBC", "SBC", "MOV1", "INC", "INC", "CMP", "POP", "MOV", "BCS", "TCALL", "CLR1", "BBC", "SBC", "SBC", "SBC", "SBC", "SBC", "SBC", "MOVW", "INC", "INC", "MOV", "DAS", "MOV", "DI", "TCALL", "SET1", "BBS", "MOV", "MOV", "MOV", "MOV", "CMP", "MOV", "MOV1", "MOV", "MOV", "MOV", "POP", "MUL", "BNE", "TCALL", "CLR1", "BBC", "MOV", "MOV", "MOV", "MOV", "MOV", "MOV", "MOVW", "MOV", "DEC", "MOV", "CBNE", "DAA", "CLRV", "TCALL", "SET1", "BBS", "MOV", "MOV", "MOV", "MOV", "MOV", "MOV", "NOT1", "MOV", "MOV", "NOTC", "POP", "SLEEP", "BEQ", "TCALL", "CLR1", "BBC", "MOV", "MOV", "MOV", "MOV", "MOV", "MOV", "MOV", "MOV", "INC", "MOV", "DBNZ", "STOP"};

   kt() {
      this.a = new cz(this.a);
   }

   public final void f() {
      this.g();
   }

   public final void g() {
      Arrays.fill(this.a, (byte)85);
      this.a[240] = 10;
      this.a[241] = -80;
      this.c = true;
      Arrays.fill(this.b, 0);
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.f = 0;
      this.g = this.g(65534);
      this.d = false;
      this.e = false;
      this.f = false;
      this.g = false;
      this.h = false;
      this.h = 0;
      this.i = this.j = 0;
      this.i = this.j = this.k = false;
      this.k = this.l = this.m = 255;
      this.n = this.o = this.p = 0;
      this.q = this.r = this.s = 0;
   }

   public final int c() {
      return this.h;
   }

   public final void b(int var1) {
      this.h = var1;
   }

   public final void c(int var1) {
      for(var1 -= 21; this.h < var1; this.a[this.d()].a()) {
         if (this.b) {
            this.a(this.g);
         }
      }

   }

   private void d(int var1) {
      this.h += var1 * 21;
      this.i += var1;
      this.j += var1;
      this.a.a(var1);
   }

   private void h() {
      int var1 = this.i;
      int var2;
      int var3;
      if (this.i) {
         var2 = this.n;
         var3 = var1 >> 7;

         while(var3-- != 0) {
            if ((var2 = var2 + 1 & 255) == this.k) {
               var2 = 0;
               this.q = this.q + 1 & 15;
            }
         }

         this.n = var2;
      }

      if (this.j) {
         var2 = this.o;
         var3 = var1 >> 7;

         while(var3-- != 0) {
            if ((var2 = var2 + 1 & 255) == this.l) {
               var2 = 0;
               this.r = this.r + 1 & 15;
            }
         }

         this.o = var2;
      }

      this.i = var1 & 127;
      var1 = this.j;
      if (this.k) {
         var2 = this.p;
         var3 = var1 >> 4;

         while(var3-- != 0) {
            if ((var2 = var2 + 1 & 255) == this.m) {
               var2 = 0;
               this.s = this.s + 1 & 15;
            }
         }

         this.p = var2;
      }

      this.j = var1 & 15;
   }

   public final int a(int var1, int var2) {
      this.c(var2);
      return this.b[var1];
   }

   public final void a(int var1, int var2, int var3) {
      this.c(var3);
      this.a[var1 + 244] = (byte)var2;
      if (this.a != null) {
         this.a.a("* IN " + fv.a(var1 + 244) + ": " + fv.a(var2) + " at " + var3);
      }

   }

   public final String a() {
      return "SPC700 (APU)";
   }

   public final String b() {
      return "A:" + fv.a(this.b) + " X:" + fv.a(this.c) + " Y:" + fv.a(this.d) + " S:" + fv.a(this.e) + " P:" + (this.h ? 'N' : 'n') + (this.g ? 'V' : 'v') + (this.f != 0 ? 'P' : 'p') + '-' + (this.f ? 'H' : 'h') + '-' + (this.e ? 'Z' : 'z') + (this.d ? 'C' : 'c') + " Clock:" + this.h;
   }

   public final String c() {
      int[] var1 = new int[3];

      int var3;
      for(var3 = 0; var3 < 3; ++var3) {
         var1[var3] = this.b(this.g + var3 & '\uffff');
      }

      afg var2 = this.a[var1[0]];
      String var8 = fv.a(this.g, 4) + "  ";
      String var4 = "";
      String var5 = "";
      int var6 = 1;

      for(var3 = 0; var3 < 2; ++var3) {
         String var7 = "";
         int var9;
         switch(var3 == 0 ? var2.b : var2.a) {
         case 1:
            break;
         case 2:
            var7 = "A";
            break;
         case 3:
            var7 = "X";
            break;
         case 4:
            var7 = "Y";
            break;
         case 5:
            var7 = "YA";
            break;
         case 6:
            var7 = "SP";
            break;
         case 7:
            var7 = "C";
            break;
         case 8:
            var7 = "#$" + fv.a(var1[var6]);
            ++var6;
            break;
         case 9:
            var7 = "$" + fv.a(var1[var6 + 1]) + fv.a(var1[var6]);
            var6 += 2;
            break;
         case 10:
            var7 = "$" + fv.a(var1[var6 + 1]) + fv.a(var1[var6]) + "+X";
            var6 += 2;
            break;
         case 11:
            var7 = "$" + fv.a(var1[var6 + 1]) + fv.a(var1[var6]) + "+Y";
            var6 += 2;
            break;
         case 12:
            var7 = "($" + fv.a(var1[var6 + 1]) + fv.a(var1[var6]) + "+X)";
            var6 += 2;
            break;
         case 13:
            var9 = var1[var6 + 1] << 8 | var1[var6];
            var7 = "$" + fv.a(var9 & 8191, 4) + "." + (var9 >> 13);
            var6 += 2;
            break;
         case 14:
            var9 = var1[var6 + 1] << 8 | var1[var6];
            var7 = "/$" + fv.a(var9 & 8191, 4) + "." + (var9 >> 13);
            var6 += 2;
            break;
         case 15:
            var7 = "D+$" + fv.a(var1[var6]);
            ++var6;
            break;
         case 16:
            var7 = "D+$" + fv.a(var1[var6]) + "+X";
            ++var6;
            break;
         case 17:
            var7 = "D+$" + fv.a(var1[var6]) + "+Y";
            ++var6;
            break;
         case 18:
            var7 = "(D+$" + fv.a(var1[var6]) + ")";
            ++var6;
            break;
         case 19:
            var7 = "(D+$" + fv.a(var1[var6]) + ")+Y";
            ++var6;
            break;
         case 20:
            var7 = "(X)";
            break;
         case 21:
            var7 = "(Y)";
            break;
         case 22:
            var7 = "(X)+";
            break;
         case 23:
            var7 = "$" + fv.a(var1[var6]) + ".0";
            ++var6;
            break;
         case 24:
            var7 = "$" + fv.a(var1[var6]) + ".1";
            ++var6;
            break;
         case 25:
            var7 = "$" + fv.a(var1[var6]) + ".2";
            ++var6;
            break;
         case 26:
            var7 = "$" + fv.a(var1[var6]) + ".3";
            ++var6;
            break;
         case 27:
            var7 = "$" + fv.a(var1[var6]) + ".4";
            ++var6;
            break;
         case 28:
            var7 = "$" + fv.a(var1[var6]) + ".5";
            ++var6;
            break;
         case 29:
            var7 = "$" + fv.a(var1[var6]) + ".6";
            ++var6;
            break;
         case 30:
            var7 = "$" + fv.a(var1[var6]) + ".7";
            ++var6;
            break;
         case 31:
            var7 = "$" + fv.a(var1[var6]);
            ++var6;
            break;
         case 32:
            var7 = "0";
            break;
         case 33:
            var7 = "1";
            break;
         case 34:
            var7 = "2";
            break;
         case 35:
            var7 = "3";
            break;
         case 36:
            var7 = "4";
            break;
         case 37:
            var7 = "5";
            break;
         case 38:
            var7 = "6";
            break;
         case 39:
            var7 = "7";
            break;
         case 40:
            var7 = "8";
            break;
         case 41:
            var7 = "9";
            break;
         case 42:
            var7 = "10";
            break;
         case 43:
            var7 = "11";
            break;
         case 44:
            var7 = "12";
            break;
         case 45:
            var7 = "13";
            break;
         case 46:
            var7 = "14";
            break;
         case 47:
            var7 = "15";
            break;
         default:
            var7 = "?";
         }

         if (var3 == 0) {
            var5 = var7;
         } else {
            var4 = var7;
         }
      }

      for(var3 = 0; var3 < 3; ++var3) {
         var8 = var8 + " ";
         if (var3 < var6) {
            var8 = var8 + fv.a(var1[var3]);
         } else {
            var8 = var8 + "  ";
         }
      }

      var8 = var8 + "  " + a[var1[0]];
      if (var4.length() != 0) {
         var8 = var8 + " " + var4;
      }

      if (var5.length() != 0) {
         var8 = var8 + ", " + var5;
      }

      return var8;
   }

   public final int a() {
      return 16;
   }

   public final jp[] a() {
      return new jp[]{new xg(this), new xh(this), new xd(this), new xe(this), new xb(this)};
   }

   public final aei[] a() {
      return new aei[]{new xc(this), new ws(this), new wr(this), new wt(this), new ix(this), new iu(this)};
   }

   private void e(int var1) {
      this.e = var1 == 0;
      this.h = (var1 & 128) != 0;
   }

   private void f(int var1) {
      this.e = var1 == 0;
      this.h = (var1 & '耀') != 0;
   }

   public final int a(int var1) {
      return this.b(var1);
   }

   private int b(int var1) {
      return var1 >= 65472 && this.c ? f(var1) : this.c(var1);
   }

   private int c(int var1) {
      if ((var1 & '\ufff0') != 240) {
         return this.e(var1);
      } else {
         switch(var1) {
         case 243:
            var1 = this.a.a(this.a[242] & 127);
            break;
         case 253:
            this.h();
            var1 = this.q;
            this.q = 0;
            break;
         case 254:
            this.h();
            var1 = this.r;
            this.r = 0;
            break;
         case 255:
            this.h();
            var1 = this.s;
            this.s = 0;
            break;
         default:
            var1 = this.e(var1);
         }

         return var1;
      }
   }

   private int d(int var1) {
      return var1 >= 65472 && this.c ? f(var1) : this.e(var1);
   }

   private int e(int var1) {
      return this.a[var1] & 255;
   }

   private static int f(int var0) {
      return c[var0 & 63];
   }

   private void a(int var1, int var2) {
      this.a[var1] = (byte)var2;
   }

   private int g(int var1) {
      return this.b(var1) | this.b(var1 + 1 & '\uffff') << 8;
   }

   private int h(int var1) {
      return this.c(var1) | this.c(var1 + 1 & '\uffff') << 8;
   }

   private void b(int var1, int var2) {
      if ((var1 & '\ufff0') == 240) {
         switch(var1) {
         case 241:
            this.h();
            if (!this.i && (var2 & 1) != 0) {
               this.n = 0;
               this.q = 0;
            }

            this.i = (var2 & 1) != 0;
            if (!this.j && (var2 & 2) != 0) {
               this.o = 0;
               this.r = 0;
            }

            this.j = (var2 & 2) != 0;
            if (!this.k && (var2 & 4) != 0) {
               this.p = 0;
               this.s = 0;
            }

            this.k = (var2 & 4) != 0;
            if ((var2 & 16) != 0) {
               this.a[244] = 0;
               this.a[245] = 0;
            }

            if ((var2 & 32) != 0) {
               this.a[246] = 0;
               this.a[247] = 0;
            }

            this.c = (var2 & 128) != 0;
         case 242:
         case 248:
         case 249:
         default:
            break;
         case 243:
            byte var3;
            if (((var3 = this.a[242]) & 128) == 0) {
               this.a.a(var3, var2);
            }
            break;
         case 244:
         case 245:
         case 246:
         case 247:
            this.b[var1 & 3] = var2;
            return;
         case 250:
            this.h();
            this.k = var2;
            break;
         case 251:
            this.h();
            this.l = var2;
            break;
         case 252:
            this.h();
            this.m = var2;
            break;
         case 253:
         case 254:
         case 255:
            return;
         }
      }

      this.a(var1, var2);
   }

   private void c(int var1, int var2) {
      this.b(var1, var2 & 255);
      this.b(var1 + 1 & '\uffff', var2 >> 8);
   }

   private int d() {
      int var1 = this.g;
      this.g = var1 + 1 & '\uffff';
      return this.d(var1);
   }

   private int e() {
      int var1 = this.g;
      this.g = var1 + 2 & '\uffff';
      return this.d(var1) | this.d(var1 + 1 & '\uffff') << 8;
   }

   private int f() {
      return this.e() + this.c & '\uffff';
   }

   private int g() {
      return this.e() + this.d & '\uffff';
   }

   private int h() {
      return this.f | this.d();
   }

   private int i() {
      return this.h(this.h());
   }

   private int j() {
      return this.h() + this.c & '\uffff';
   }

   private int k() {
      return this.h() + this.d & '\uffff';
   }

   private int l() {
      return this.h(this.j());
   }

   private int m() {
      return this.i() + this.d & '\uffff';
   }

   private int n() {
      return this.f | this.c;
   }

   private int o() {
      int var1 = this.c;
      this.c = var1 + 1 & 255;
      return this.f | var1;
   }

   private void i() {
      int var1 = this.g;
      byte var2 = (byte)this.d(var1);
      this.g = var1 + 1 + var2 & '\uffff';
      this.d(4);
   }

   private void g(int var1) {
      int var2 = this.e;
      this.a(256 | var2, var1);
      this.e = var2 - 1 & 255;
   }

   private int p() {
      int var1 = this.e;
      this.e = var1 = var1 + 1 & 255;
      return this.e(256 | var1);
   }

   private void h(int var1) {
      this.d = (var1 & 1) != 0;
      this.e = (var1 & 2) != 0;
      this.f = (var1 & 8) != 0;
      this.f = (var1 & 32) != 0 ? 256 : 0;
      this.g = (var1 & 64) != 0;
      this.h = (var1 & 128) != 0;
   }

   public final void a(int var1, vy var2, vy var3, vy var4) {
      int var5 = var2.c();
      this.c = var2.a();
      var2.a(var1 < 2 ? 1 : 4);
      var2.a(1);
      this.b[0] = var2.a();
      this.b[1] = var2.a();
      this.b[2] = var2.a();
      this.b[3] = var2.a();
      byte[] var6 = new byte[128];
      var2.a(var6);
      this.a.a(var6);
      var2.a(this.a, 65472, 64);
      this.i = 0;
      this.j = 0;
      this.n = var2.b() & 255;
      this.o = var2.b() & 255;
      this.p = var2.b() & 255;
      this.k = var2.b() & 255;
      this.l = var2.b() & 255;
      this.m = var2.b() & 255;
      this.i = var2.a();
      this.j = var2.a();
      this.k = var2.a();
      var2.a(3);
      int var7 = 0;
      if (var1 >= 4) {
         var7 = var2.c();
      }

      var4.a(this.a, 0, 65216);
      var4.a(64);
      this.q = this.a[253] & 15;
      this.r = this.a[254] & 15;
      this.s = this.a[255] & 15;
      this.h(var3.a());
      this.d = var3.a();
      this.b = var3.a();
      this.c = var3.a();
      this.e = var3.a();
      this.g = var3.b();
      fv.a("Snes9x APU Cycles: %d / %d", var5, var7);
      this.h = 0;
   }

   // $FF: synthetic method
   static int a(kt var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static int a(kt var0, int var1) {
      return var0.b = var1;
   }

   // $FF: synthetic method
   static int b(kt var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static int b(kt var0, int var1) {
      return var0.c = var1;
   }

   // $FF: synthetic method
   static int c(kt var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static int c(kt var0, int var1) {
      return var0.d = var1;
   }

   // $FF: synthetic method
   static int d(kt var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static int d(kt var0, int var1) {
      return var0.e = var1;
   }

   // $FF: synthetic method
   static int e(kt var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static int e(kt var0, int var1) {
      return var0.g = var1;
   }

   // $FF: synthetic method
   static boolean a(kt var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static boolean a(kt var0, boolean var1) {
      return var0.h = var1;
   }

   // $FF: synthetic method
   static boolean b(kt var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static boolean b(kt var0, boolean var1) {
      return var0.g = var1;
   }

   // $FF: synthetic method
   static int f(kt var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static int f(kt var0, int var1) {
      return var0.f = var1;
   }

   // $FF: synthetic method
   static boolean c(kt var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static boolean c(kt var0, boolean var1) {
      return var0.f = var1;
   }

   // $FF: synthetic method
   static boolean d(kt var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static boolean d(kt var0, boolean var1) {
      return var0.e = var1;
   }

   // $FF: synthetic method
   static boolean e(kt var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static boolean e(kt var0, boolean var1) {
      return var0.d = var1;
   }

   // $FF: synthetic method
   static int g(kt var0) {
      return var0.b(var0.f());
   }

   // $FF: synthetic method
   static int a(kt var0, int var1, int var2) {
      int var3 = var1 + var2 + (var0.d ? 1 : 0);
      var0.d = (var3 & 256) != 0;
      var3 &= 255;
      var0.g = (~(var1 ^ var2) & (var2 ^ var3) & 128) != 0;
      var0.f = ((var1 ^ var2 ^ var3) & 16) != 0;
      var0.e(var3);
      return var3;
   }

   // $FF: synthetic method
   static void a(kt var0, int var1) {
      var0.d(var1);
   }

   // $FF: synthetic method
   static int h(kt var0) {
      return var0.c(var0.h());
   }

   // $FF: synthetic method
   static int i(kt var0) {
      return var0.b(var0.l());
   }

   // $FF: synthetic method
   static int j(kt var0) {
      return var0.c(var0.n());
   }

   // $FF: synthetic method
   static int k(kt var0) {
      return var0.c(var0.j());
   }

   // $FF: synthetic method
   static int l(kt var0) {
      return var0.b(var0.g());
   }

   // $FF: synthetic method
   static int m(kt var0) {
      return var0.b(var0.e());
   }

   // $FF: synthetic method
   static int n(kt var0) {
      return var0.b(var0.m());
   }

   // $FF: synthetic method
   static int o(kt var0) {
      return var0.d();
   }

   // $FF: synthetic method
   static int p(kt var0) {
      return var0.c(var0.f | var0.d);
   }

   // $FF: synthetic method
   static int q(kt var0) {
      return var0.n();
   }

   // $FF: synthetic method
   static int g(kt var0, int var1) {
      return var0.b(var1);
   }

   // $FF: synthetic method
   static void a(kt var0, int var1, int var2) {
      var0.b(var1, var2);
   }

   // $FF: synthetic method
   static int r(kt var0) {
      return var0.h();
   }

   // $FF: synthetic method
   static int s(kt var0) {
      return var0.d << 8 | var0.b;
   }

   // $FF: synthetic method
   static int t(kt var0) {
      return var0.i();
   }

   // $FF: synthetic method
   static int b(kt var0, int var1, int var2) {
      int var3 = var1 + var2;
      var0.d = (var3 & 65536) != 0;
      var3 &= 65535;
      var0.g = (~(var1 ^ var2) & (var2 ^ var3) & '耀') != 0;
      var0.f = ((var1 ^ var2 ^ var3) & 256) != 0;
      var0.f(var3);
      return var3;
   }

   // $FF: synthetic method
   static void b(kt var0, int var1) {
      var0.d = var1 >> 8;
      var0.b = var1 & 255;
   }

   // $FF: synthetic method
   static int h(kt var0, int var1) {
      return var0.b &= var1;
   }

   // $FF: synthetic method
   static void c(kt var0, int var1) {
      var0.e(var1);
   }

   // $FF: synthetic method
   static int u(kt var0) {
      return var0.e();
   }

   // $FF: synthetic method
   static int v(kt var0) {
      return var0.j();
   }

   // $FF: synthetic method
   static int i(kt var0, int var1) {
      var0.d = (var1 & 128) != 0;
      var1 = var1 << 1 & 255;
      var0.e(var1);
      return var1;
   }

   // $FF: synthetic method
   static int w(kt var0) {
      return var0.e();
   }

   // $FF: synthetic method
   static void a(kt var0, boolean var1) {
      if (var1) {
         var0.i();
      } else {
         var0.g = var0.g + 1 & '\uffff';
         var0.d(2);
      }
   }

   // $FF: synthetic method
   static void a(kt var0) {
      var0.i();
   }

   // $FF: synthetic method
   static int j(kt var0, int var1) {
      return var0.g(var1);
   }

   // $FF: synthetic method
   static void d(kt var0, int var1) {
      int var2 = var0.e;
      var0.a(256 | var2 - 1 & 255, var1 & 255);
      var0.a(256 | var2, var1 >> 8);
      var0.e = var2 - 2 & 255;
   }

   // $FF: synthetic method
   static void b(kt var0) {
      int var1 = 0;
      if (var0.d) {
         var1 = 1;
      }

      if (var0.e) {
         var1 |= 2;
      }

      if (var0.f) {
         var1 |= 8;
      }

      if (var0.f != 0) {
         var1 |= 32;
      }

      if (var0.g) {
         var1 |= 64;
      }

      if (var0.h) {
         var1 |= 128;
      }

      var0.g(var1);
   }

   // $FF: synthetic method
   static void b(kt var0, int var1, int var2) {
      var1 -= var2;
      var0.e(var1);
      var0.d = var1 >= 0;
   }

   // $FF: synthetic method
   static void c(kt var0, int var1, int var2) {
      var1 -= var2;
      var0.f(var1);
      var0.d = var1 >= 0;
   }

   // $FF: synthetic method
   static void d(kt var0, int var1, int var2) {
      var0.c(var1, var2);
   }

   // $FF: synthetic method
   static void e(kt var0, int var1) {
      var0.f(var1);
   }

   // $FF: synthetic method
   static int k(kt var0, int var1) {
      return var0.b ^= var1;
   }

   // $FF: synthetic method
   static int x(kt var0) {
      return var0.g(var0.f());
   }

   // $FF: synthetic method
   static int l(kt var0, int var1) {
      var0.d = (var1 & 1) != 0;
      var1 >>= 1;
      var0.e(var1);
      return var1;
   }

   // $FF: synthetic method
   static int y(kt var0) {
      return var0.g();
   }

   // $FF: synthetic method
   static int z(kt var0) {
      return var0.c(var0.k());
   }

   // $FF: synthetic method
   static int A(kt var0) {
      return var0.c(var0.o());
   }

   // $FF: synthetic method
   static int B(kt var0) {
      return var0.f();
   }

   // $FF: synthetic method
   static int C(kt var0) {
      return var0.k();
   }

   // $FF: synthetic method
   static int D(kt var0) {
      return var0.m();
   }

   // $FF: synthetic method
   static int E(kt var0) {
      return var0.o();
   }

   // $FF: synthetic method
   static int F(kt var0) {
      return var0.l();
   }

   // $FF: synthetic method
   static void f(kt var0, int var1) {
      var0.c(var0.h(), var1);
   }

   // $FF: synthetic method
   static int m(kt var0, int var1) {
      return var0.b |= var1;
   }

   // $FF: synthetic method
   static int G(kt var0) {
      return var0.p();
   }

   // $FF: synthetic method
   static void c(kt var0) {
      var0.h(var0.p());
   }

   // $FF: synthetic method
   static void g(kt var0, int var1) {
      var0.g(var1);
   }

   // $FF: synthetic method
   static int H(kt var0) {
      int var1 = var0.e;
      var0.e = var1 = var1 + 2 & 255;
      return var0.e(256 | var1 - 1 & 255) | var0.e(256 | var1) << 8;
   }

   // $FF: synthetic method
   static int n(kt var0, int var1) {
      var1 = var1 << 1 | (var0.d ? 1 : 0);
      var0.d = (var1 & 256) != 0;
      var1 &= 255;
      var0.e(var1);
      return var1;
   }

   // $FF: synthetic method
   static int o(kt var0, int var1) {
      if (var0.d) {
         var1 |= 256;
      }

      var0.d = (var1 & 1) != 0;
      var1 >>= 1;
      var0.e(var1);
      return var1;
   }

   // $FF: synthetic method
   static int c(kt var0, int var1, int var2) {
      int var3 = var1 - var2 - (var0.d ? 0 : 1);
      var0.d = (var3 & 256) == 0;
      var3 &= 255;
      var0.g = (~(var1 ^ var2) & (var2 ^ var3) & 128) != 0;
      var0.f = ((var1 ^ var2 ^ var3) & 16) == 0;
      var0.e(var3);
      return var3;
   }

   // $FF: synthetic method
   static int d(kt var0, int var1, int var2) {
      int var3 = var1 - var2;
      var0.d = (var3 & 65536) == 0;
      var3 &= 65535;
      var0.g = (~(var1 ^ var2) & (var2 ^ var3) & '耀') != 0;
      var0.f = ((var1 ^ var2 ^ var3) & 256) == 0;
      var0.f(var3);
      return var3;
   }
}
