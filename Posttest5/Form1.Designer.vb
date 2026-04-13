<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    Private components As System.ComponentModel.IContainer

    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.txtKode = New System.Windows.Forms.TextBox()
        Me.txtNama = New System.Windows.Forms.TextBox()
        Me.txtHarga = New System.Windows.Forms.TextBox()
        Me.txtSearch = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.btnSimpan = New System.Windows.Forms.Button()
        Me.btnUbah = New System.Windows.Forms.Button()
        Me.btnHapus = New System.Windows.Forms.Button()
        Me.btnBatal = New System.Windows.Forms.Button()
        Me.dgvData = New System.Windows.Forms.DataGridView()
        CType(Me.dgvData, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()

        ' FORM
        Me.BackColor = System.Drawing.Color.FromArgb(30, 30, 30)
        Me.ClientSize = New System.Drawing.Size(800, 500)
        Me.Text = "Manajemen Bengkel"
        Me.StartPosition = FormStartPosition.CenterScreen

        ' LABEL JUDUL
        Me.Label1.Text = "MANAJEMEN BENGKEL"
        Me.Label1.ForeColor = Color.White
        Me.Label1.Font = New Font("Segoe UI", 16, FontStyle.Bold)
        Me.Label1.Location = New Point(200, 10)
        Me.Label1.AutoSize = True

        ' KODE
        Me.Label2.Text = "Kode Service"
        Me.Label2.ForeColor = Color.White
        Me.Label2.Location = New Point(30, 70)

        Me.txtKode.Location = New Point(150, 70)
        Me.txtKode.Width = 200

        ' NAMA
        Me.Label3.Text = "Nama Service"
        Me.Label3.ForeColor = Color.White
        Me.Label3.Location = New Point(30, 110)

        Me.txtNama.Location = New Point(150, 110)
        Me.txtNama.Width = 200

        ' HARGA
        Me.Label4.Text = "Harga"
        Me.Label4.ForeColor = Color.White
        Me.Label4.Location = New Point(30, 150)

        Me.txtHarga.Location = New Point(150, 150)
        Me.txtHarga.Width = 200

        ' SEARCH
        Me.txtSearch.Location = New Point(500, 70)
        Me.txtSearch.Width = 200

        Dim lblCari As New Label()
        lblCari.Text = "Cari Data"
        lblCari.ForeColor = Color.White
        lblCari.Location = New Point(500, 50)
        lblCari.AutoSize = True
        Me.Controls.Add(lblCari)

        ' BUTTON STYLE
        Me.btnSimpan.Text = "SIMPAN"
        Me.btnSimpan.BackColor = Color.Green
        Me.btnSimpan.ForeColor = Color.White
        Me.btnSimpan.Location = New Point(30, 200)

        Me.btnUbah.Text = "UBAH"
        Me.btnUbah.BackColor = Color.Orange
        Me.btnUbah.ForeColor = Color.White
        Me.btnUbah.Location = New Point(130, 200)

        Me.btnHapus.Text = "HAPUS"
        Me.btnHapus.BackColor = Color.Red
        Me.btnHapus.ForeColor = Color.White
        Me.btnHapus.Location = New Point(230, 200)

        Me.btnBatal.Text = "RESET"
        Me.btnBatal.BackColor = Color.Gray
        Me.btnBatal.ForeColor = Color.White
        Me.btnBatal.Location = New Point(330, 200)

        ' DATAGRID
        Me.dgvData.Location = New Point(30, 250)
        Me.dgvData.Size = New Size(740, 200)
        Me.dgvData.BackgroundColor = Color.White

        ' ADD CONTROL
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.txtKode)
        Me.Controls.Add(Me.txtNama)
        Me.Controls.Add(Me.txtHarga)
        Me.Controls.Add(Me.txtSearch)
        Me.Controls.Add(Me.btnSimpan)
        Me.Controls.Add(Me.btnUbah)
        Me.Controls.Add(Me.btnHapus)
        Me.Controls.Add(Me.btnBatal)
        Me.Controls.Add(Me.dgvData)

        CType(Me.dgvData, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()
    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents txtKode As TextBox
    Friend WithEvents txtNama As TextBox
    Friend WithEvents txtHarga As TextBox
    Friend WithEvents txtSearch As TextBox
    Friend WithEvents btnSimpan As Button
    Friend WithEvents btnUbah As Button
    Friend WithEvents btnHapus As Button
    Friend WithEvents btnBatal As Button
    Friend WithEvents dgvData As DataGridView

End Class