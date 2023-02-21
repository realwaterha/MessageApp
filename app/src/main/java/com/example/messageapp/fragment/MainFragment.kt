package com.example.messageapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.messageapp.R
import com.example.messageapp.adapter.MessageAdaper
import com.example.messageapp.data.MessageData
import com.example.messageapp.databinding.FragmentMainBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class MainFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    lateinit var navController: NavController
    lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        val rv_message = binding.rvMessage
        val item = ArrayList<MessageData>()
        item.add(MessageData("누구", "안녕", "고객에게 보냅니다", "2023-02-21"))
        item.add(MessageData("누구", "안녕", "고객에게 보냅니다", "2023-02-21"))
        item.add(MessageData("누구", "안녕", "고객에게 보냅니다", "2023-02-21"))
        item.add(MessageData("누구", "안녕", "고객에게 보냅니다", "2023-02-21"))
        item.add(MessageData("누구", "안녕", "고객에게 보냅니다", "2023-02-21"))
        item.add(MessageData("누구", "안녕", "고객에게 보냅니다", "2023-02-21"))
        item.add(MessageData("누구", "안녕", "고객에게 보냅니다", "2023-02-21"))
        item.add(MessageData("누구", "안녕", "고객에게 보냅니다", "2023-02-21"))
        item.add(MessageData("누구", "안녕", "고객에게 보냅니다", "2023-02-21"))
        item.add(MessageData("누구", "안녕", "고객에게 보냅니다", "2023-02-21"))

        val messageAdaper = MessageAdaper(item)
        messageAdaper.notifyDataSetChanged()
        rv_message.adapter = messageAdaper
        rv_message.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}