class App {
  static DOMAIN_SERVER = "http://localhost:21088";
  static API_SERVER = this.DOMAIN_SERVER + '/api';

  static API_VIDEO = this.API_SERVER + '/videos';
  static showDeleteConfirmDialog() {
    return Swal.fire({
      icon: 'warning',
      text: 'Are you sure you want to delete the selected data ?',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Yes, delete it !',
      cancelButtonText: 'Cancel',
    });
  }

  static showSuccessAlert(t) {
    Swal.fire({
      icon: 'success',
      title: t,
      position: 'top-end',
      showConfirmButton: false,
      timer: 1500,
    });
  }

  static showErrorAlert(t) {
    Swal.fire({
      icon: 'error',
      title: 'Warning',
      text: t,
    });
  }
}


class Video {
  constructor(id, title, description,playlist) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.playlist = playlist;
  }
}

