package com.example.mvvm

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import ru.samsung.itacademy.mdev.MainViewModel


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainViewModelTest {
    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Test
    fun testIncrement() {
        val model = MainViewModel()
        model.onIncrementClicked()
        Assert.assertEquals(1, model.counter.value)
        model.onIncrementClicked()
        Assert.assertEquals(2, model.counter.value)
    }
}
