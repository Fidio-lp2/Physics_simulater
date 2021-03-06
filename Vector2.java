public class Vector2 {
          double x;
          double y;

          //コンストラクタその１
          public Vector2() {}
          // コンストラクタその２
          public Vector2(double x, double y) {
              this.x = x;
              this.y = y;
          }

          // 値の代入し直し
          public void init(double x, double y) {
                    this.x = x;
                    this.y = y;
          }

          // ベクトルの足し算
          public Vector2 add(Vector2 vec) {
                    return new Vector2(this.x+vec.x, this.y+vec.y);
          }
          public static Vector2 add(Vector2 vec0, Vector2 vec1) {
                    return new Vector2(vec0.x+vec1.x, vec0.y+vec1.y);
          }

          // ベクトルの各要素を定数倍する
          public Vector2 multiple(double value) {
                    return new Vector2(this.x*value, this.y*value);
          }

          // 逆ベクトルの取得
          public Vector2 inverse() {
                    return new Vector2((-1)*this.x, (-1)*this.y);
          }

          // 法線ベクトルの取得
          public Vector2 normal() {
                    return new Vector2(this.y, (-1)*this.x);
          }

          // ベクトルのノルムの取得
          public double norm() {
                    return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
          }

          // ベクトルの内積
          public static double inner(Vector2 vec0, Vector2 vec1) {
                    return vec0.x * vec1.x + vec0.y * vec1.y;
          }

          // ベクトルの外積
          public static double cross(Vector2 vec0, Vector2 vec1) {
                    return vec0.x * vec1.y - vec0.y * vec1.x;
          }

          // ２点を結ぶベクトルを求める(→この向きです)
          public static Vector2 sub(Vector2 vec0, Vector2 vec1) {
                    return new Vector2(vec0.x-vec1.x, vec0.y-vec1.y);
          }

          // 二つのベクトルを比べる.
          public boolean equals(Vector2 vec) {
                    if (this.x == vec.x && this.y == vec.y) return true;
                    else return false;
          }
          public static boolean equals(Vector2 vec0, Vector2 vec1) {
                    if (vec0.x == vec1.x && vec0.y == vec1.y) return true;
                    else return false;
          }

          // 二つのベクトルの間の大きさを取得する
          public static double getLength(Vector2 vec0, Vector2 vec1) {
                    return Math.sqrt(Math.pow(vec0.x-vec1.x, 2)+Math.pow(vec0.y-vec1.y, 2));
          }
}
