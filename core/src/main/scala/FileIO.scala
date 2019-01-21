
trait Using {
  def apply[A, R <: { def close() }](r : R)(f : R => A) : A = {
    try {
      f(r)
    } finally {
      if (r != null) r.close()
    }
  }
}

object FileIO extends Using {

}
