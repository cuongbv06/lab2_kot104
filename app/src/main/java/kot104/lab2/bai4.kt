package kot104.lab2

class QuanLySinhVien {
    private val danhSachSinhVien = mutableListOf<SinhVienModel>()

    fun themSinhVien(sv: SinhVienModel) {
        danhSachSinhVien.add(sv)
    }

    fun suaSinhVien(mssv: String, tenMoi: String, diemTBMoi: Float, daTotNghiepMoi: Boolean?, tuoiMoi: Int?) {
        val sv = danhSachSinhVien.find { it.mssv == mssv }
        sv?.apply {
            tenSV = tenMoi
            diemTB = diemTBMoi
            daTotNghiep = daTotNghiepMoi
            tuoi = tuoiMoi
        }
    }

    fun xoaSinhVien(mssv: String) {
        danhSachSinhVien.removeAll { it.mssv == mssv }
    }

    fun xemDanhSachSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            println("Danh sách sinh viên trống.")
        } else {
            println("Danh sách sinh viên:")
            danhSachSinhVien.forEachIndexed { index, sv ->
                println("${index + 1}. ${sv.toString()}")
            }
        }
    }
}

fun main() {
    val quanLySV = QuanLySinhVien()

    // Thêm sinh viên
    quanLySV.themSinhVien(SinhVienModel("Nguyen Van A", "SV001", 8.5f, true, 21))
    quanLySV.themSinhVien(SinhVienModel("Tran Thi B", "SV002", 7.2f, false, 22))

    // Hiển thị danh sách sinh viên
    quanLySV.xemDanhSachSinhVien()

    // Sửa thông tin sinh viên
    quanLySV.suaSinhVien("SV002", "Tran Thi C", 7.8f, true, 23)
    println("Sau khi sửa thông tin:")
    quanLySV.xemDanhSachSinhVien()

    // Xóa sinh viên
    quanLySV.xoaSinhVien("SV001")
    println("Sau khi xóa sinh viên:")
    quanLySV.xemDanhSachSinhVien()
}