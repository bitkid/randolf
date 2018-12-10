import RundomeTest.A
import RundomeTest.B
import com.oneeyedmen.minutest.junit.JUnit5Minutests
import com.oneeyedmen.minutest.junit.context

// this is just the first test from the minutest readme converted to strikt, to check that both work
class RundomeTest : JUnit5Minutests {
    data class A(val a: Int, val b: Int, val c: B)
    data class B(val a: String)


    // The fixture type is the generic type of the test, here Stack<String>
    override val tests = context<B> {

        // The fixture block tells Minutest how to create an instance of the fixture.
        // Minutest will call it once for every test.
        fixture {
            Rundome.create()
        }

        test("fixture works") {
            // no idea what i could assert on the object
        }

        derivedContext<A>("different type") {
            deriveFixture { Rundome.create() }
        }
    }
}

object Rundome {
    @Suppress("IMPLICIT_CAST_TO_ANY")
    inline fun <reified T> create(): T = when (T::class) {
        A::class -> A(1, 2, B("blah"))
        B::class -> B("blah")
        else -> throw RuntimeException()
    } as T

}

