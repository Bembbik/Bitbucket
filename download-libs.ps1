# Скачивает Bootstrap 5 и jQuery в папки проекта (запускать из папки musicians)
# PowerShell:  .\download-libs.ps1
$ErrorActionPreference = "Stop"
$web = "src\main\webapp"
$files = @{
  "$web\css\bootstrap.min.css"      = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
  "$web\js\bootstrap.bundle.min.js" = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
  "$web\js\jquery-3.6.4.js"         = "https://code.jquery.com/jquery-3.6.4.js"
}
foreach ($f in $files.GetEnumerator()) {
  Invoke-WebRequest -Uri $f.Value -OutFile $f.Key
  Write-Host "OK  $($f.Key)"
}
