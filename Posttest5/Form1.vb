Public Class Form1

    Sub Tampil()
        dgvData.DataSource = GetAllData()
    End Sub

    Sub Bersih()
        txtKode.Clear()
        txtNama.Clear()
        txtHarga.Clear()
        txtSearch.Clear()
        txtKode.Focus()
    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Tampil()
    End Sub

    ' SIMPAN
    Private Sub btnSimpan_Click(sender As Object, e As EventArgs) Handles btnSimpan.Click
        If Not Validasi(txtKode, txtNama, txtHarga) Then Exit Sub

        If SimpanData(txtKode.Text, txtNama.Text, CInt(txtHarga.Text)) Then
            MessageBox.Show("Data berhasil disimpan")
            Tampil()
            Bersih()
        End If
    End Sub

    ' UBAH
    Private Sub btnUbah_Click(sender As Object, e As EventArgs) Handles btnUbah.Click
        If Not Validasi(txtKode, txtNama, txtHarga) Then Exit Sub

        If UbahData(txtKode.Text, txtNama.Text, CInt(txtHarga.Text)) Then
            MessageBox.Show("Data berhasil diubah")
            Tampil()
            Bersih()
        End If
    End Sub

    ' HAPUS
    Private Sub btnHapus_Click(sender As Object, e As EventArgs) Handles btnHapus.Click
        If txtKode.Text = "" Then
            MessageBox.Show("Pilih data dulu!")
            Exit Sub
        End If

        If MessageBox.Show("Hapus data?", "Konfirmasi", MessageBoxButtons.YesNo) = DialogResult.Yes Then
            If HapusData(txtKode.Text) Then
                MessageBox.Show("Data berhasil dihapus")
                Tampil()
                Bersih()
            End If
        End If
    End Sub

    ' RESET
    Private Sub btnBatal_Click(sender As Object, e As EventArgs) Handles btnBatal.Click
        Bersih()
        Tampil()
    End Sub

    ' KLIK DATAGRID
    Private Sub dgvData_CellClick(sender As Object, e As DataGridViewCellEventArgs) Handles dgvData.CellClick
        If e.RowIndex >= 0 Then
            txtKode.Text = dgvData.Rows(e.RowIndex).Cells("kodeService").Value.ToString()
            txtNama.Text = dgvData.Rows(e.RowIndex).Cells("namaService").Value.ToString()
            txtHarga.Text = dgvData.Rows(e.RowIndex).Cells("harga").Value.ToString()
        End If
    End Sub

    ' SEARCH
    Private Sub txtSearch_TextChanged(sender As Object, e As EventArgs) Handles txtSearch.TextChanged
        If txtSearch.Text = "" Then
            Tampil()
        Else
            dgvData.DataSource = SearchData(txtSearch.Text)
        End If
    End Sub

End Class