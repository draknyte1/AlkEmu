package jsnes;

abstract class adv extends cb {
   private static final int[] b = new int[]{0, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 0, 1, 1, 2};
   protected jw[] a;
   protected int c;
   protected int d;
   protected int e;
   protected int f;
   protected int g;
   protected int h;
   protected int i;
   protected jw a;
   protected int j;
   private jw b;
   private jw c;
   protected boolean c;
   protected boolean d;
   protected boolean e;
   protected boolean f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   private int b;
   protected int k;
   private afc[] a = new afc[]{new qn(this), new ql(this), new qp(this), new qo(this), new ri(this), new rj(this), new rk(this), new rl(this), new rg(this), new rh(this), new qv(this), new qx(this), new qz(this), new ro(this), new rp(this), new rn(this), new rq(this), new rt(this), new ru(this), new rr(this), new rs(this), new rz(this), new ry(this), new rw(this), new rv(this), new sa(this), new se(this), new sd(this), new sc(this), new sb(this), new sf(this), new sh(this), new sk(this), new sl(this), new sm(this), new so(this), new sq(this), new sr(this), new st(this), new ss(this), new sv(this), new su(this), new sx(this), new ta(this), new sy(this), new tc(this), new tb(this), new td(this), new tk(this), new ti(this), new tj(this), new tg(this), new th(this), new te(this), new tf(this), new to(this), new tn(this), new tl(this), new tv(this), new tt(this), new ts(this), new tr(this), new tq(this), new tp(this), new ud(this), new ue(this), new uf(this), new ug(this), new ty(this), new tz(this), new ua(this), new uc(this), new uk(this), new ui(this), new up(this), new ur(this), new uq(this), new un(this), new um(this), new uo(this), new ach(this), new ace(this), new acd(this), new acg(this), new acf(this), new aca(this), new abz(this), new acc(this), new acb(this), new aby(this), new abt(this), new abu(this), new abv(this), new abw(this), new abr(this), new abs(this), new abp(this), new abo(this), new abn(this), new abm(this), new abl(this), new abk(this), new abj(this), new abi(this), new abh(this), new abg(this), new abc(this), new aba(this), new abb(this), new aay(this), new aaz(this), new aax(this), new ady(this), new aeb(this), new aea(this), new adr(this), new adq(this), new adt(this), new ads(this), new adw(this), new adu(this), new adx(this), new ado(this), new adp(this), new adh(this), new adi(this), new adj(this), new adl(this), new adg(this), new adf(this), new ade(this), new add(this), new acx(this), new acw(this), new acv(this), new acu(this), new ada(this), new acz(this), new act(this), new acq(this), new acr(this), new acl(this), new acm(this), new ack(this), new aew(this), new aer(this), new aes(this), new aet(this), new aeu(this), new aez(this), new afa(this), new afb(this), new afd(this), new aex(this), new ael(this), new aek(this), new aeo(this), new aem(this), new aeq(this), new aep(this), new wv(this), new ww(this), new wx(this), new wy(this), new wz(this), new yn(this), new yo(this), new yl(this), new ym(this), new yj(this), new ys(this), new yt(this), new yp(this), new yr(this), new yw(this), new yv(this), new zd(this), new zc(this), new zb(this), new za(this), new yz(this), new yy(this), new xm(this), new xo(this), new xp(this), new xq(this), new xw(this), new xr(this), new xs(this), new xu(this), new xv(this), new xz(this), new ye(this), new yg(this), new yf(this), new yb(this), new ya(this), new yd(this), new yc(this), new aab(this), new aac(this), new aaa(this), new aae(this), new aaf(this), new aai(this), new aaj(this), new aag(this), new aah(this), new aar(this), new aaq(this), new aao(this), new aan(this), new aaw(this), new aav(this), new aau(this), new aas(this), new ze(this), new zf(this), new zh(this), new zj(this), new zk(this), new zl(this), new zm(this), new zn(this), new zp(this), new zs(this), new zq(this), new zu(this), new zt(this), new zw(this), new zv(this), new zz(this), new zx(this), new cu(this), new cy(this), new cv(this), new dc(this), new da(this), new de(this), new dd(this), new ci(this), new cj(this), new ck(this), new cm(this), new cn(this), new co(this), new cp(this), new cq(this), new cr(this), new cs(this), new di(this), new dp(this), new do(this), new dn(this), new dm(this), new dq(this)};
   private afc[] b = new afc[]{null, new kl(this), null, new tw(this), new bf(this), new wd(this), new ab(this), new qc(this), null, new qf(this), new p(this), null, new wa(this), new cx(this), new vt(this), new ay(this), null, new uz(this), new df(this), new xi(this), new jc(this), new dw(this), new vk(this), new bp(this), null, new eb(this), new qb(this), null, new wk(this), new ji(this), new wi(this), new ii(this), null, new afn(this), null, new afp(this), new gg(this), new wf(this), new ga(this), new wb(this), null, new ma(this), new acy(this), null, new acs(this), new kw(this), new ux(this), new cl(this), null, new bw(this), new vh(this), new jj(this), new wh(this), new jk(this), new uu(this), new bm(this), null, new bq(this), new bk(this), null, new dt(this), new aam(this), new jt(this), new vz(this), null, new aat(this), null, new zr(this), null, new zg(this), new ch(this), new xt(this), new he(this), new xy(this), new zo(this), null, null, new is(this), new aak(this), new iz(this), null, new mp(this), new aed(this), new mw(this), null, new nx(this), new aev(this), new nj(this), null, new pn(this), null, null, null, new adk(this), new jr(this), new acn(this), null, new abx(this), null, new bu(this), new qj(this), new az(this), new va(this), new cw(this), new qr(this), new bd(this), new bh(this), null, null, new kj(this), new bx(this), new tx(this), null, new vl(this), new bn(this), new sp(this), new adb(this), new ob(this), new acj(this), new uv(this), null, new qe(this), null, null, null, new yh(this), new jm(this), new yx(this), null, new z(this), null, new ak(this), null, new afh(this), null, new aap(this), null, new afo(this), new gb(this), null, null, new aeg(this), null, new be(this), null, new vp(this), new cf(this), new sg(this), null, new afj(this), null, new bo(this), new sz(this), new ec(this), null, null, new vb(this), new db(this), new wo(this), new hn(this), null, new bz(this), null, new abd(this), null, new ps(this), null, new js(this), null, new ny(this), null, null, null, new br(this), null, new aci(this), null, new xa(this), new lf(this), new adc(this), null, new al(this), null, new zi(this), null, new afk(this), null, null, null, new vi(this), null, new vf(this), null, new gx(this), null, new jx(this), null, new ie(this), new ff(this), new vv(this), null, new vu(this), null, null, null, new bc(this), new qs(this), new aef(this), null, new jf(this), new aad(this), new ly(this), null, new g(this), new rx(this), new adn(this), null, new wu(this), null, null, null, new yq(this), new fw(this), new vw(this), null, new wn(this), null, new abq(this), null, new wj(this), new hl(this), new vg(this), null, new jl(this), null, null, null, new bs(this), new uy(this), new fq(this), null, new uw(this), new vj(this), new ed(this), null, new eg(this), new vs(this), new ev(this), null, new en(this), null, null, null, new tm(this), new av(this), new vx(this)};
   private afc[] c = new afc[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ih(this), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new aen(this), null, null, null, null, null, new qa(this), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new qq(this), null, null, null, null, null, null, null, null, null, new qg(this), null, new gr(this), null, new hk(this), null, null, null, new nc(this), null, new ms(this), null, null, null, null, null, new lr(this), null, new lz(this), null, null, null, null, new bb(this), null, null, null, null, new uh(this), null, new ub(this), null, new adz(this), null, new adm(this), null, new acp(this), null, new mz(this), null, new ul(this), null, new jy(this), null, null, null, null, null, new sw(this), null, new sn(this), null, null, null, new aff(this), new nz(this), new aal(this), null, new cc(this), null, new wc(this), null, null, null, new aej(this), null, null, null, new fh(this), null, new wm(this), null, new qi(this), null, null, null, null, null, null, null, null, null, null, null, null, null, new lj(this), null, null, null, null, null, new ce(this), null, null, null, new kd(this), null, null, null, new dj(this), null, null, null, new vc(this), null, null, null, null, null, null, null, null, null, null, null, null, null, new we(this), null, null, null, null, null};
   private afc[] d = new afc[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new em(this), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new il(this), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new qk(this), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
   private afc[] e = new afc[256];
   private afc[] f;
   private static String[] a = new String[]{"BRK", "ORA", "COP", "ORA", "TSB", "ORA", "ASL", "ORA", "PHP", "ORA", "ASL", "PHD", "TSB", "ORA", "ASL", "ORA", "BPL", "ORA", "ORA", "ORA", "TRB", "ORA", "ASL", "ORA", "CLC", "ORA", "INC", "TCS", "TRB", "ORA", "ASL", "ORA", "JSR", "AND", "JSL", "AND", "BIT", "AND", "ROL", "AND", "PLP", "AND", "ROL", "PLD", "BIT", "AND", "ROL", "AND", "BMI", "AND", "AND", "AND", "BIT", "AND", "ROL", "AND", "SEC", "AND", "DEC", "TSC", "BIT", "AND", "ROL", "AND", "RTI", "EOR", "WDM", "EOR", "MVP", "EOR", "LSR", "EOR", "PHA", "EOR", "LSR", "PHK", "JMP", "EOR", "LSR", "EOR", "BVC", "EOR", "EOR", "EOR", "MVN", "EOR", "LSR", "EOR", "CLI", "EOR", "PHY", "TCD", "JMP", "EOR", "LSR", "EOR", "RTS", "ADC", "PER", "ADC", "STZ", "ADC", "ROR", "ADC", "PLA", "ADC", "ROR", "RTL", "JMP", "ADC", "ROR", "ADC", "BVS", "ADC", "ADC", "ADC", "STZ", "ADC", "ROR", "ADC", "SEI", "ADC", "PLY", "TDC", "JMP", "ADC", "ROR", "ADC", "BRA", "STA", "BRL", "STA", "STY", "STA", "STX", "STA", "DEY", "BIT", "TXA", "PHB", "STY", "STA", "STX", "STA", "BCC", "STA", "STA", "STA", "STY", "STA", "STX", "STA", "TYA", "STA", "TXS", "TXY", "STZ", "STA", "STZ", "STA", "LDY", "LDA", "LDX", "LDA", "LDY", "LDA", "LDX", "LDA", "TAY", "LDA", "TAX", "PLB", "LDY", "LDA", "LDX", "LDA", "BCS", "LDA", "LDA", "LDA", "LDY", "LDA", "LDX", "LDA", "CLV", "LDA", "TSC", "TYX", "LDY", "LDA", "LDX", "LDA", "CPY", "CMP", "REP", "CMP", "CPY", "CMP", "DEC", "CMP", "INY", "CMP", "DEX", "WAI", "CPY", "CMP", "DEC", "CMP", "BNE", "CMP", "CMP", "CMP", "PEI", "CMP", "DEC", "CMP", "CLD", "CMP", "PHX", "STP", "JML", "CMP", "DEC", "CMP", "CPX", "SBC", "SEP", "SBC", "CPX", "SBC", "INC", "SBC", "INX", "SBC", "NOP", "XBA", "CPX", "SBC", "INC", "SBC", "BEQ", "SBC", "SBC", "SBC", "PEA", "SBC", "INC", "SBC", "SED", "SBC", "PLX", "XCE", "JSR", "SBC", "INC", "SBC"};

   public adv() {
      fv.a("CPU65816: Create");
      int var1 = 0;

      for(int var2 = 0; var2 < 256; ++var2) {
         afc var3 = this.a[var2];
         afc var4 = this.b[var2];
         afc var5 = this.c[var2];
         afc var6 = this.d[var2];
         if (var3.a == -1 || var3.a == -2) {
            var3.a = 4;
         }

         ++var1;
         if (var4 != null) {
            if (var4.a == -1) {
               var4.a = 3;
            }

            ++var1;
         }

         if (var5 != null) {
            if (var5.a == -2) {
               var5.a = 3;
            }

            ++var1;
         }

         if (var6 != null) {
            ++var1;
         }

         afc var7;
         if (var4 != null) {
            var7 = var4;
         } else if (var5 != null) {
            var7 = var5;
         } else {
            var7 = var3;
         }

         this.e[var2] = var7;
         if (var4 == null) {
            this.b[var2] = var3;
         }

         if (var5 == null) {
            this.c[var2] = var3;
         }

         if (var6 == null) {
            this.d[var2] = var7;
         }
      }

      fv.a("CPU65816: " + var1 + " instructions implemented");
   }

   public void f() {
      this.c = 0;
      this.d = this.e = 0;
      this.e(0);
      this.f(0);
      this.c = this.a[0];
      this.f = 0;
      this.g = 256;
      this.h = this.l(65532);
      this.i = true;
      this.d = true;
      this.e = false;
      this.f = true;
      this.g = true;
      this.m();
      this.a = 0;
   }

   public void h() {
      if (this.b) {
         this.a(this.j << 16 | this.h);
      }

      this.f[this.d()].a();
   }

   public final int c() {
      return this.k;
   }

   public void d(int var1) {
      this.k = var1;
   }

   protected final void e(int var1) {
      this.i = var1;
      this.a = this.a[var1];
   }

   protected final void f(int var1) {
      this.j = var1;
      this.b = this.a[var1];
   }

   protected final void g(int var1) {
      this.h = var1;
   }

   protected final void m() {
      if (!this.g) {
         if (!this.f) {
            this.f = this.a;
         } else {
            this.f = this.c;
         }
      } else if (!this.f) {
         this.f = this.b;
      } else if (!this.i) {
         this.f = this.e;
      } else {
         this.f = this.d;
      }
   }

   protected final void h(int var1) {
      if (!this.i) {
         this.c(this.j);
      }

      this.k(this.h);
      this.j();
      this.e = false;
      this.d = true;
      this.f(0);
      this.h = this.l(var1);
      this.d();
   }

   protected abstract void g();

   protected abstract void b(int var1);

   public final String b() {
      return "A:" + fv.a(this.c, 4) + " X:" + fv.a(this.d, 4) + " Y:" + fv.a(this.e, 4) + "  DB:" + fv.a(this.i) + " D:" + fv.a(this.f, 4) + " S:" + fv.a(this.g, 4) + " P:" + (this.i ? 'E' : 'e') + (this.b() ? 'N' : 'n') + (this.h ? 'V' : 'v') + (this.g ? 'M' : 'm') + (this.f ? 'X' : 'x') + (this.e ? 'D' : 'd') + (this.d ? 'I' : 'i') + (this.a() ? 'Z' : 'z') + (this.c ? 'C' : 'c') + " Clock:" + this.k;
   }

   public final String c() {
      StringBuilder var1 = new StringBuilder(70);
      int[] var2 = new int[4];

      int var3;
      for(var3 = 0; var3 < 4; ++var3) {
         var2[var3] = this.b.a(this.h + var3 & '\uffff');
      }

      var1.append(fv.a(this.j)).append(':').append(fv.a(this.h, 4)).append("  ");
      if (var2[0] < 0) {
         var1.append("Invalid memory");
         return var1.toString();
      } else {
         afc var5 = this.f[var2[0]];
         if (ow.a) {
            int var4 = 1 + b[var5.a];

            for(var3 = 0; var3 < 4; ++var3) {
               if (var3 < var4) {
                  var1.append(fv.a(var2[var3]));
               } else {
                  var1.append("  ");
               }

               var1.append(' ');
            }

            var1.append(' ');
         }

         var1.append(a[var2[0]]);
         String var6;
         if ((var6 = var5.getClass().getSimpleName()).endsWith("_M")) {
            var1.append(" M");
         }

         if (var6.endsWith("_X")) {
            var1.append(" X");
         }

         if (var6.endsWith("_E")) {
            var1.append(" E");
         }

         String var7 = "";
         switch(var5.a) {
         case 1:
         case 23:
            break;
         case 2:
            var7 = "A";
            break;
         case 3:
            var7 = "#$" + fv.a(var2[1]);
            break;
         case 4:
            var7 = "#$" + fv.a(var2[2]) + fv.a(var2[1]);
            break;
         case 5:
            var7 = "$" + fv.a(var2[2]) + fv.a(var2[1]);
            break;
         case 6:
            var7 = "$" + fv.a(var2[2]) + fv.a(var2[1]) + ",X";
            break;
         case 7:
            var7 = "$" + fv.a(var2[2]) + fv.a(var2[1]) + ",Y";
            break;
         case 8:
            var7 = "($" + fv.a(var2[2]) + fv.a(var2[1]) + ")";
            break;
         case 9:
            var7 = "[$" + fv.a(var2[2]) + fv.a(var2[1]) + "]";
            break;
         case 10:
            var7 = "($" + fv.a(var2[2]) + fv.a(var2[1]) + ",X)";
            break;
         case 11:
            var7 = "$" + fv.a(var2[3]) + fv.a(var2[2]) + fv.a(var2[1]);
            break;
         case 12:
            var7 = "$" + fv.a(var2[3]) + fv.a(var2[2]) + fv.a(var2[1]) + ",X";
            break;
         case 13:
            var7 = "D,$" + fv.a(var2[1]);
            break;
         case 14:
            var7 = "D,$" + fv.a(var2[1]) + ",X";
            break;
         case 15:
            var7 = "D,$" + fv.a(var2[1]) + ",Y";
            break;
         case 16:
            var7 = "(D,$" + fv.a(var2[1]) + ")";
            break;
         case 17:
            var7 = "(D,$" + fv.a(var2[1]) + ",X)";
            break;
         case 18:
            var7 = "(D,$" + fv.a(var2[1]) + "),Y";
            break;
         case 19:
            var7 = "[D,$" + fv.a(var2[1]) + "]";
            break;
         case 20:
            var7 = "[D,$" + fv.a(var2[1]) + "],Y";
            break;
         case 21:
            var7 = "$" + fv.a(var2[1]);
            break;
         case 22:
            var7 = "$" + fv.a(var2[2]) + fv.a(var2[1]);
            break;
         case 24:
            var7 = "$" + fv.a(var2[1]) + ",S";
            break;
         case 25:
            var7 = "($" + fv.a(var2[1]) + ",S),Y";
            break;
         case 26:
            var7 = "$" + fv.a(var2[1]) + " $" + fv.a(var2[2]);
            break;
         default:
            var7 = "?" + var5.a;
         }

         if (var7.length() != 0) {
            var1.append(' ').append(var7);
         }

         return var1.toString();
      }
   }

   public final jp[] a() {
      return new jp[]{new qh(this), new qt(this), new qu(this), new qw(this), new qy(this), new ra(this), new rb(this), new rc(this)};
   }

   public final aei[] a() {
      return new aei[]{new re(this), new ot(this), new or(this), new op(this), new oo(this), new on(this), new om(this), new ol(this), new pg(this)};
   }

   public final int a() {
      return 24;
   }

   protected final int b() {
      int var1;
      return (var1 = this.b.a(this.h)) < 0 ? 0 : this.j << 16 | this.h + 1 + b[this.f[var1].a] & '\uffff';
   }

   protected final jw a(int var1) {
      return this.a[var1];
   }

   private int a(int var1) {
      adv var10000 = this;
      int var2 = var1 >> 16;
      return var10000.a[var2].b(var1 & '\uffff');
   }

   public final int d(int var1) {
      adv var10000 = this;
      int var2 = var1 >> 16;
      return var10000.a[var2].a(var1 & '\uffff');
   }

   private void a(int var1, int var2) {
      adv var10000 = this;
      int var3 = var1 >> 16;
      var10000.a[var3].a(var1 & '\uffff', var2);
   }

   private int b(int var1) {
      adv var10000 = this;
      int var2 = var1 >> 16;
      return var10000.a[var2].e(var1 & '\uffff');
   }

   private void b(int var1, int var2) {
      adv var10000 = this;
      int var3 = var1 >> 16;
      var10000.a[var3].d(var1 & '\uffff', var2);
   }

   private int d() {
      int var1 = this.h;
      this.h = var1 + 1 & '\uffff';
      return this.b.b(var1);
   }

   private int e() {
      int var1 = this.h;
      this.h = var1 + 2 & '\uffff';
      return this.b.d(var1);
   }

   private int f() {
      int var1 = this.h;
      this.h = var1 + 3 & '\uffff';
      return this.b.g(var1);
   }

   private int c(int var1) {
      return this.a.b(var1);
   }

   private int e(int var1) {
      return this.a.e(var1);
   }

   private void c(int var1, int var2) {
      this.a.a(var1, var2);
   }

   private void d(int var1, int var2) {
      this.a.d(var1, var2);
   }

   private int a(boolean var1) {
      int var2 = this.d;
      int var3 = this.e() + var2;
      if (var1 || !this.f || (var3 & 255) < var2) {
         this.g();
      }

      return var3;
   }

   private int f(int var1) {
      return this.a.c(var1);
   }

   private int g(int var1) {
      return this.a.f(var1);
   }

   private void e(int var1, int var2) {
      this.a.b(var1, var2);
   }

   private void f(int var1, int var2) {
      this.a.e(var1, var2);
   }

   private int b(boolean var1) {
      int var2 = this.e;
      int var3 = this.e() + var2;
      if (var1 || !this.f || (var3 & 255) < var2) {
         this.g();
      }

      return var3;
   }

   private int g() {
      return this.f() + this.d & 16777215;
   }

   private int h() {
      int var1 = this.f;
      if ((this.f & 255) != 0) {
         this.g();
      }

      return var1 + this.d() & '\uffff';
   }

   private int h(int var1) {
      return this.c.b(var1);
   }

   private int i(int var1) {
      return this.c.d(var1);
   }

   private int i() {
      return this.i(this.h());
   }

   private int j() {
      return this.c.g(this.h());
   }

   private void g(int var1, int var2) {
      this.c.a(var1, var2);
   }

   private void h(int var1, int var2) {
      this.c.c(var1, var2);
   }

   private int k() {
      int var1 = this.f;
      if ((this.f & 255) == 0) {
         this.g();
      } else {
         this.b(2);
      }

      return var1 + this.d() + this.d & '\uffff';
   }

   private int j(int var1) {
      return this.c.b(var1);
   }

   private int k(int var1) {
      return this.c.d(var1);
   }

   private int l() {
      return this.k(this.k());
   }

   private void i(int var1, int var2) {
      this.c.a(var1, var2);
   }

   private void j(int var1, int var2) {
      this.c.c(var1, var2);
   }

   private int m() {
      int var1 = this.f;
      if ((this.f & 255) == 0) {
         this.g();
      } else {
         this.b(2);
      }

      return var1 + this.d() + this.e & '\uffff';
   }

   private int c(boolean var1) {
      int var2 = this.e;
      int var3 = this.i() + var2;
      if (var1 || !this.f || (var3 & 255) < var2) {
         this.g();
      }

      return var3;
   }

   private int n() {
      return this.j() + this.e & 16777215;
   }

   private int o() {
      this.g();
      return this.g + this.d() & '\uffff';
   }

   private int p() {
      return this.c.d(this.o());
   }

   private int q() {
      this.g();
      return this.p() + this.e;
   }

   private int l(int var1) {
      return this.c.d(var1);
   }

   protected final void i(int var1) {
      this.b = var1 << 8;
   }

   protected final void j(int var1) {
      this.b = var1;
   }

   private void a(boolean var1, boolean var2) {
      this.b = (var1 ? 0 : 1) | (var2 ? 65536 : 0);
   }

   protected final boolean a() {
      return (this.b & '\uffff') == 0;
   }

   protected final boolean b() {
      return (this.b & 98304) != 0;
   }

   protected final void b(boolean var1) {
      this.a(var1, this.b());
   }

   protected final void c(boolean var1) {
      this.a(this.a(), var1);
   }

   private void c(int var1) {
      int var2 = this.g;
      this.c.a(var2, var1);
      --var2;
      if (!this.i) {
         var2 &= 65535;
      } else {
         var2 = var2 & 255 | 256;
      }

      this.g = var2;
   }

   private void k(int var1) {
      int var2 = this.g;
      this.c.c(var2 - 1 & '\uffff', var1);
      var2 -= 2;
      if (!this.i) {
         var2 &= 65535;
      } else {
         var2 = var2 & 255 | 256;
      }

      this.g = var2;
   }

   private int r() {
      int var1 = this.g;
      ++var1;
      if (!this.i) {
         var1 &= 65535;
      } else {
         var1 = var1 & 255 | 256;
      }

      this.g = var1;
      return this.c.b(var1);
   }

   private void j() {
      int var1 = 0;
      if (this.c) {
         var1 = 1;
      }

      if (this.a()) {
         var1 |= 2;
      }

      if (this.d) {
         var1 |= 4;
      }

      if (this.e) {
         var1 |= 8;
      }

      if (this.f) {
         var1 |= 16;
      }

      if (this.g) {
         var1 |= 32;
      }

      if (this.h) {
         var1 |= 64;
      }

      if (this.b()) {
         var1 |= 128;
      }

      this.c(var1);
   }

   private void k() {
      byte var1 = (byte)this.d();
      int var2 = this.h + var1 & '\uffff';
      if (this.i && (var2 & '\uff00') != (this.h & '\uff00')) {
         this.b(2);
      } else {
         this.g();
      }

      this.h = var2;
   }

   private void k(int var1, int var2) {
      var1 -= var2;
      this.c = var1 >= 0;
      this.b = var1 & '\uffff';
   }

   private void l(int var1, int var2) {
      var1 -= var2;
      this.c = var1 >= 0;
      this.i(var1 & 255);
   }

   protected abstract void i();

   // $FF: synthetic method
   static int a(adv var0) {
      return var0.a.f(var0.q());
   }

   // $FF: synthetic method
   static void a(adv var0, int var1) {
      int var2 = var1;
      var1 = var0.c;
      int var3;
      if (!var0.e) {
         var3 = var1 + var2;
         if (var0.c) {
            ++var3;
         }

         var0.c = (var3 & 65536) != 0;
         var3 &= 65535;
      } else {
         var3 = (var1 & 15) + (var2 & 15);
         if (var0.c) {
            ++var3;
         }

         if (var3 >= 10) {
            var3 += 6;
         }

         if ((var3 += (var1 & 240) + (var2 & 240)) >= 160) {
            var3 += 96;
         }

         if ((var3 += (var1 & 3840) + (var2 & 3840)) >= 2560) {
            var3 += 1536;
         }

         if ((var3 += (var1 & '\uf000') + (var2 & '\uf000')) >= 40960) {
            var3 += 24576;
            var3 &= 65535;
            var0.c = true;
         } else {
            var0.c = false;
         }
      }

      var0.h = (~(var1 ^ var2) & (var2 ^ var3) & '耀') != 0;
      var0.b = var3;
      var0.c = var3;
   }

   // $FF: synthetic method
   static int b(adv var0) {
      return var0.e(var0.e());
   }

   // $FF: synthetic method
   static int c(adv var0) {
      return var0.b(var0.f());
   }

   // $FF: synthetic method
   static int d(adv var0) {
      return var0.g(var0.a(false));
   }

   // $FF: synthetic method
   static int e(adv var0) {
      return var0.a.e(var0.l());
   }

   // $FF: synthetic method
   static int f(adv var0) {
      return var0.a.f(var0.c(false));
   }

   // $FF: synthetic method
   static int g(adv var0) {
      return var0.b(var0.j());
   }

   // $FF: synthetic method
   static int h(adv var0) {
      return var0.a.e(var0.i());
   }

   // $FF: synthetic method
   static int i(adv var0) {
      return var0.b(var0.g());
   }

   // $FF: synthetic method
   static int j(adv var0) {
      return var0.a.f(var0.b(false));
   }

   // $FF: synthetic method
   static int k(adv var0) {
      return var0.b(var0.n());
   }

   // $FF: synthetic method
   static int l(adv var0) {
      return var0.e();
   }

   // $FF: synthetic method
   static int m(adv var0) {
      return var0.i();
   }

   // $FF: synthetic method
   static int n(adv var0) {
      return var0.l();
   }

   // $FF: synthetic method
   static int o(adv var0) {
      return var0.p();
   }

   // $FF: synthetic method
   static void b(adv var0, int var1) {
      var0.b = var0.c &= var1;
   }

   // $FF: synthetic method
   static int p(adv var0) {
      return var0.a(true);
   }

   // $FF: synthetic method
   static int a(adv var0, int var1) {
      return var0.g(var1);
   }

   // $FF: synthetic method
   static int b(adv var0, int var1) {
      var0.c = (var1 & '耀') != 0;
      var1 = var1 << 1 & '\uffff';
      var0.b = var1;
      return var1;
   }

   // $FF: synthetic method
   static void a(adv var0, int var1, int var2) {
      var0.f(var1, var2);
   }

   // $FF: synthetic method
   static int q(adv var0) {
      return var0.h();
   }

   // $FF: synthetic method
   static int c(adv var0, int var1) {
      return var0.i(var1);
   }

   // $FF: synthetic method
   static void b(adv var0, int var1, int var2) {
      var0.h(var1, var2);
   }

   // $FF: synthetic method
   static int r(adv var0) {
      return var0.k();
   }

   // $FF: synthetic method
   static int d(adv var0, int var1) {
      return var0.k(var1);
   }

   // $FF: synthetic method
   static void c(adv var0, int var1, int var2) {
      var0.j(var1, var2);
   }

   // $FF: synthetic method
   static int s(adv var0) {
      return var0.e();
   }

   // $FF: synthetic method
   static int e(adv var0, int var1) {
      return var0.e(var1);
   }

   // $FF: synthetic method
   static void d(adv var0, int var1, int var2) {
      var0.d(var1, var2);
   }

   // $FF: synthetic method
   static void a(adv var0, boolean var1) {
      if (var1) {
         var0.k();
      } else {
         var0.d();
      }
   }

   // $FF: synthetic method
   static int t(adv var0) {
      return var0.e();
   }

   // $FF: synthetic method
   static void c(adv var0, int var1) {
      var0.h = (var1 & 16384) != 0;
      var0.b = var0.c & var1 | (var1 & '耀') << 1;
   }

   // $FF: synthetic method
   static void a(adv var0) {
      var0.k();
   }

   // $FF: synthetic method
   static int u(adv var0) {
      return var0.d();
   }

   // $FF: synthetic method
   static int v(adv var0) {
      return (short)var0.e();
   }

   // $FF: synthetic method
   static void d(adv var0, int var1) {
      var0.k(var0.c, var1);
   }

   // $FF: synthetic method
   static void e(adv var0, int var1, int var2) {
      var0.k(var1, var2);
   }

   // $FF: synthetic method
   static void e(adv var0, int var1) {
      var0.b = var0.c ^= var1;
   }

   // $FF: synthetic method
   static int w(adv var0) {
      return var0.c.g(var0.e());
   }

   // $FF: synthetic method
   static int x(adv var0) {
      return var0.c.d(var0.e());
   }

   // $FF: synthetic method
   static int y(adv var0) {
      return var0.b.d(var0.e() + var0.d & '\uffff');
   }

   // $FF: synthetic method
   static void f(adv var0, int var1) {
      var0.c(var1);
   }

   // $FF: synthetic method
   static void g(adv var0, int var1) {
      var0.k(var1);
   }

   // $FF: synthetic method
   static void h(adv var0, int var1) {
      var0.b = var0.c = var1;
   }

   // $FF: synthetic method
   static int z(adv var0) {
      return var0.c.d(var0.m());
   }

   // $FF: synthetic method
   static int f(adv var0, int var1) {
      var0.c = (var1 & 1) != 0;
      var1 >>= 1;
      var0.b = var1;
      return var1;
   }

   // $FF: synthetic method
   static void i(adv var0, int var1) {
      var0.b = var0.c |= var1;
   }

   // $FF: synthetic method
   static void b(adv var0) {
      var0.j();
   }

   // $FF: synthetic method
   static int A(adv var0) {
      int var1 = var0.g;
      var1 += 2;
      if (!var0.i) {
         var1 &= 65535;
      } else {
         var1 = var1 & 255 | 256;
      }

      var0.g = var1;
      return var0.c.d(var1 - 1 & '\uffff');
   }

   // $FF: synthetic method
   static int B(adv var0) {
      return var0.r();
   }

   // $FF: synthetic method
   static void c(adv var0) {
      int var1 = var0.r();
      var0.c = (var1 & 1) != 0;
      var0.d = (var1 & 4) != 0;
      var0.e = (var1 & 8) != 0;
      if (!var0.i) {
         var0.f = (var1 & 16) != 0;
         if (var0.f) {
            var0.d &= 255;
            var0.e &= 255;
         }

         var0.g = (var1 & 32) != 0;
      }

      var0.h = (var1 & 64) != 0;
      var0.a((var1 & 2) != 0, (var1 & 128) != 0);
      var0.m();
   }

   // $FF: synthetic method
   static int g(adv var0, int var1) {
      var1 = var1 << 1 | (var0.c ? 1 : 0);
      var0.c = (var1 & 65536) != 0;
      var1 &= 65535;
      var0.b = var1;
      return var1;
   }

   // $FF: synthetic method
   static int h(adv var0, int var1) {
      if (var0.c) {
         var1 |= 65536;
      }

      var0.c = (var1 & 1) != 0;
      var1 >>= 1;
      var0.b = var1;
      return var1;
   }

   // $FF: synthetic method
   static void j(adv var0, int var1) {
      int var2 = var1;
      var1 = var0.c;
      int var3;
      if (!var0.e) {
         var3 = var1 - var2;
         if (!var0.c) {
            --var3;
         }

         var0.c = (var3 & 65536) == 0;
      } else {
         var3 = (var1 & 15) - (var2 & 15);
         if (!var0.c) {
            --var3;
         }

         if (var3 >= 10) {
            var3 -= 6;
         }

         if ((var3 += (var1 & 240) - (var2 & 240)) >= 160) {
            var3 -= 96;
         }

         if ((var3 += (var1 & 3840) - (var2 & 3840)) >= 2560) {
            var3 -= 1536;
         }

         if ((var3 += (var1 & '\uf000') - (var2 & '\uf000')) >= 40960) {
            var3 -= 24576;
            var0.c = false;
         } else {
            var0.c = true;
         }
      }

      var3 &= 65535;
      var0.h = (~(var1 ^ var2) & (var2 ^ var3) & '耀') != 0;
      var0.b = var3;
      var0.c = var3;
   }

   // $FF: synthetic method
   static void k(adv var0, int var1) {
      var0.c.c(var0.o(), var1);
   }

   // $FF: synthetic method
   static void l(adv var0, int var1) {
      var0.a.d(var0.l(), var1);
   }

   // $FF: synthetic method
   static void m(adv var0, int var1) {
      var0.a.e(var0.c(true), var1);
   }

   // $FF: synthetic method
   static void n(adv var0, int var1) {
      var0.b(var0.n(), var1);
   }

   // $FF: synthetic method
   static void o(adv var0, int var1) {
      var0.b(var0.f(), var1);
   }

   // $FF: synthetic method
   static void p(adv var0, int var1) {
      var0.a.e(var0.b(true), var1);
   }

   // $FF: synthetic method
   static void q(adv var0, int var1) {
      var0.a.e(var0.q(), var1);
   }

   // $FF: synthetic method
   static void r(adv var0, int var1) {
      var0.j(var0.k(), var1);
   }

   // $FF: synthetic method
   static void s(adv var0, int var1) {
      var0.d(var0.e(), var1);
   }

   // $FF: synthetic method
   static void t(adv var0, int var1) {
      var0.f(var0.a(true), var1);
   }

   // $FF: synthetic method
   static void u(adv var0, int var1) {
      var0.b(var0.j(), var1);
   }

   // $FF: synthetic method
   static void v(adv var0, int var1) {
      var0.b(var0.g(), var1);
   }

   // $FF: synthetic method
   static void w(adv var0, int var1) {
      var0.h(var0.h(), var1);
   }

   // $FF: synthetic method
   static void x(adv var0, int var1) {
      var0.a.d(var0.i(), var1);
   }

   // $FF: synthetic method
   static void y(adv var0, int var1) {
      var0.c.c(var0.m(), var1);
   }

   // $FF: synthetic method
   static int C(adv var0) {
      return var0.a.c(var0.q());
   }

   // $FF: synthetic method
   static void z(adv var0, int var1) {
      int var2 = var0.c;
      int var10001 = var2 & '\uff00';
      int var10003 = var2 & 255;
      var2 = var1;
      var1 = var10003;
      int var3;
      if (!var0.e) {
         var3 = var1 + var2;
         if (var0.c) {
            ++var3;
         }

         var0.c = (var3 & 256) != 0;
         var3 &= 255;
      } else {
         var3 = (var1 & 15) + (var2 & 15);
         if (var0.c) {
            ++var3;
         }

         if (var3 >= 10) {
            var3 += 6;
         }

         if ((var3 += (var1 & 240) + (var2 & 240)) >= 160) {
            var3 += 96;
            var3 &= 255;
            var0.c = true;
         } else {
            var0.c = false;
         }
      }

      var0.h = (~(var1 ^ var2) & (var2 ^ var3) & 128) != 0;
      var0.i(var3);
      var0.c = var10001 | var3;
   }

   // $FF: synthetic method
   static int D(adv var0) {
      return var0.c(var0.e());
   }

   // $FF: synthetic method
   static int E(adv var0) {
      return var0.a(var0.f());
   }

   // $FF: synthetic method
   static int F(adv var0) {
      return var0.f(var0.a(false));
   }

   // $FF: synthetic method
   static int G(adv var0) {
      return var0.a.b(var0.l());
   }

   // $FF: synthetic method
   static int H(adv var0) {
      return var0.a.c(var0.c(false));
   }

   // $FF: synthetic method
   static int I(adv var0) {
      return var0.a(var0.j());
   }

   // $FF: synthetic method
   static int J(adv var0) {
      return var0.a.b(var0.i());
   }

   // $FF: synthetic method
   static int K(adv var0) {
      return var0.a(var0.g());
   }

   // $FF: synthetic method
   static int L(adv var0) {
      return var0.a.c(var0.b(false));
   }

   // $FF: synthetic method
   static int M(adv var0) {
      return var0.a(var0.n());
   }

   // $FF: synthetic method
   static int N(adv var0) {
      return var0.d();
   }

   // $FF: synthetic method
   static int O(adv var0) {
      return var0.h(var0.h());
   }

   // $FF: synthetic method
   static int P(adv var0) {
      return var0.j(var0.k());
   }

   // $FF: synthetic method
   static int Q(adv var0) {
      return var0.c.b(var0.o());
   }

   // $FF: synthetic method
   static void A(adv var0, int var1) {
      int var2;
      var1 &= var2 = var0.c;
      var0.c = var2 & '\uff00' | var1;
      var0.i(var1);
   }

   // $FF: synthetic method
   static int i(adv var0, int var1) {
      return var0.f(var1);
   }

   // $FF: synthetic method
   static int j(adv var0, int var1) {
      var0.c = (var1 & 128) != 0;
      var1 = var1 << 1 & 255;
      var0.i(var1);
      return var1;
   }

   // $FF: synthetic method
   static void f(adv var0, int var1, int var2) {
      var0.e(var1, var2);
   }

   // $FF: synthetic method
   static int k(adv var0, int var1) {
      return var0.h(var1);
   }

   // $FF: synthetic method
   static void g(adv var0, int var1, int var2) {
      var0.g(var1, var2);
   }

   // $FF: synthetic method
   static int l(adv var0, int var1) {
      return var0.j(var1);
   }

   // $FF: synthetic method
   static void h(adv var0, int var1, int var2) {
      var0.i(var1, var2);
   }

   // $FF: synthetic method
   static int m(adv var0, int var1) {
      return var0.c(var1);
   }

   // $FF: synthetic method
   static void i(adv var0, int var1, int var2) {
      var0.c(var1, var2);
   }

   // $FF: synthetic method
   static void B(adv var0, int var1) {
      var0.h = (var1 & 64) != 0;
      var0.b = var0.c & var1 | (var1 & 128) << 9;
   }

   // $FF: synthetic method
   static void C(adv var0, int var1) {
      var0.l(var0.c & 255, var1);
   }

   // $FF: synthetic method
   static void D(adv var0, int var1) {
      int var2;
      var1 ^= (var2 = var0.c) & 255;
      var0.c = var2 & '\uff00' | var1;
      var0.i(var1);
   }

   // $FF: synthetic method
   static void E(adv var0, int var1) {
      var0.c = var0.c & '\uff00' | var1;
      var0.i(var1);
   }

   // $FF: synthetic method
   static int n(adv var0, int var1) {
      var0.c = (var1 & 1) != 0;
      var1 >>= 1;
      var0.i(var1);
      return var1;
   }

   // $FF: synthetic method
   static void F(adv var0, int var1) {
      int var2;
      var1 |= (var2 = var0.c) & 255;
      var0.c = var2 & '\uff00' | var1;
      var0.i(var1);
   }

   // $FF: synthetic method
   static int o(adv var0, int var1) {
      var1 = var1 << 1 | (var0.c ? 1 : 0);
      var0.c = (var1 & 256) != 0;
      var1 &= 255;
      var0.i(var1);
      return var1;
   }

   // $FF: synthetic method
   static int p(adv var0, int var1) {
      if (var0.c) {
         var1 |= 256;
      }

      var0.c = (var1 & 1) != 0;
      var1 >>= 1;
      var0.i(var1);
      return var1;
   }

   // $FF: synthetic method
   static void G(adv var0, int var1) {
      int var2 = var0.c;
      int var10001 = var2 & '\uff00';
      int var10003 = var2 & 255;
      var2 = var1;
      var1 = var10003;
      int var3;
      if (!var0.e) {
         var3 = var1 - var2;
         if (!var0.c) {
            --var3;
         }

         var0.c = (var3 & 256) == 0;
      } else {
         var3 = (var1 & 15) - (var2 & 15);
         if (!var0.c) {
            --var3;
         }

         if (var3 >= 10) {
            var3 -= 6;
         }

         if ((var3 += (var1 & 240) - (var2 & 240)) >= 160) {
            var3 -= 96;
            var0.c = false;
         } else {
            var0.c = true;
         }
      }

      var3 &= 255;
      var0.h = (~(var1 ^ var2) & (var2 ^ var3) & 128) != 0;
      var0.i(var3);
      var0.c = var10001 | var3;
   }

   // $FF: synthetic method
   static void H(adv var0, int var1) {
      var0.c.a(var0.o(), var1);
   }

   // $FF: synthetic method
   static void I(adv var0, int var1) {
      var0.a.a(var0.l(), var1);
   }

   // $FF: synthetic method
   static void J(adv var0, int var1) {
      var0.a.b(var0.c(true), var1);
   }

   // $FF: synthetic method
   static void K(adv var0, int var1) {
      var0.a(var0.n(), var1);
   }

   // $FF: synthetic method
   static void L(adv var0, int var1) {
      var0.a(var0.f(), var1);
   }

   // $FF: synthetic method
   static void M(adv var0, int var1) {
      var0.a.b(var0.b(true), var1);
   }

   // $FF: synthetic method
   static void N(adv var0, int var1) {
      var0.a.b(var0.q(), var1);
   }

   // $FF: synthetic method
   static void O(adv var0, int var1) {
      var0.i(var0.k(), var1);
   }

   // $FF: synthetic method
   static void P(adv var0, int var1) {
      var0.c(var0.e(), var1);
   }

   // $FF: synthetic method
   static void Q(adv var0, int var1) {
      var0.e(var0.a(true), var1);
   }

   // $FF: synthetic method
   static void R(adv var0, int var1) {
      var0.a(var0.j(), var1);
   }

   // $FF: synthetic method
   static void S(adv var0, int var1) {
      var0.a(var0.g(), var1);
   }

   // $FF: synthetic method
   static void T(adv var0, int var1) {
      var0.g(var0.h(), var1);
   }

   // $FF: synthetic method
   static void U(adv var0, int var1) {
      var0.a.a(var0.i(), var1);
   }

   // $FF: synthetic method
   static void j(adv var0, int var1, int var2) {
      var0.l(var1, var2);
   }

   // $FF: synthetic method
   static int R(adv var0) {
      return var0.c.b(var0.m());
   }

   // $FF: synthetic method
   static void V(adv var0, int var1) {
      var0.c.a(var0.m(), var1);
   }
}
